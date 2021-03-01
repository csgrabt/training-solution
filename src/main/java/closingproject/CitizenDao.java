package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;
import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.time.LocalDate;




public class CitizenDao {


    public void zipCodeReader(DataSource dataSource, String filename, String regex) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of(filename))) {
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(regex);
                try (Connection conn = dataSource.getConnection();
                     PreparedStatement stmt = conn.prepareStatement("insert into zipcodes(zip, city, district) values (?, ?, ?)")) {
                    if (data.length == 3) {
                        stmt.setString(1, data[0]);
                        stmt.setString(2, data[1]);
                        stmt.setString(3, data[2]);
                        stmt.executeUpdate();
                    } else {
                        stmt.setString(1, data[0]);
                        stmt.setString(2, data[1]);
                        stmt.setString(3, null);
                        stmt.executeUpdate();
                    }
                } catch (SQLException se) {
                    throw new IllegalArgumentException("Something went wrong during writing database", se);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong during reading file!");
        }
    }


    public String findCityByZipcode(DataSource dataSource, String zipCode) {
        String city = null;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("select city from zipcodes where zip = ?");
        ) {

            ps.setString(1, zipCode);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    city = rs.getString(1);
                }
            } catch (SQLException se) {
                throw new IllegalStateException("Something went wrong during reading the DB!", se);
            }
        } catch (SQLException sql) {

            throw new IllegalStateException("Cannot select city", sql);
        }
        if (city == null) {
            throw new IllegalArgumentException("Db does not contain the ZipCode!");
        }
        return city;
    }


    public void writeRegistrationToDB(DataSource dataSource, Citizen citizen) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj) values (?, ?, ?, ?, ?)")) {

            stmt.setString(1, citizen.getFullName());
            stmt.setString(2, citizen.getZipCode());
            stmt.setInt(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getHealthInsuranceNumber());
            stmt.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalArgumentException("Something went wrong during writing database", se);
        }


    }

    public void writeRegisterFromFileToDb(DataSource dataSource, String str, String regex) {
        Path path1 = Path.of(str);


        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            int counter = 1;
            try (PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj) values (?, ?, ?, ?, ?)")) {


                try (BufferedReader bf = Files.newBufferedReader(path1)) {

                    String line;
                    bf.readLine();

                    while ((line = bf.readLine()) != null) {
                        counter++;
                        String[] citizenArray = line.split(regex);

                        Citizen cz = new Citizen(
                                citizenArray[0],
                                citizenArray[1],
                                Integer.parseInt(citizenArray[2]),
                                citizenArray[3],
                                citizenArray[4],
                                dataSource
                        );
                        stmt.setString(1, cz.getFullName());
                        stmt.setString(2, cz.getZipCode());
                        stmt.setInt(3, cz.getAge());
                        stmt.setString(4, cz.getEmail());
                        stmt.setString(5, cz.getHealthInsuranceNumber());
                        stmt.executeUpdate();

                    }
                    conn.commit();
                } catch (IOException ioe) {
                    throw new IllegalArgumentException("Cannot read file", ioe);
                }

            } catch (IllegalArgumentException ioe) {
                conn.rollback();
                throw new IllegalArgumentException("Rollback, there is an error in the " + counter + "th line!", ioe);
            }


        } catch (SQLException sql) {
            throw new IllegalArgumentException("Cannot Insert" + sql.toString(), sql);
        }


    }


    public Integer searchCitizenIdBasedOnTaj(DataSource dataSource, String taj) {
        new Citizen().validatorHealthInsuranceNumber(taj);
        int id = 0;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("select citizen_id from citizens where taj = ?");

        ) {

            ps.setString(1, taj);


            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt(1);

                } else {
                    throw new IllegalArgumentException("The Database does not contained this TAJ number!");
                }
            } catch (SQLException sql) {
                throw new IllegalArgumentException("No data", sql);
            }

        } catch (SQLException sql) {

            throw new IllegalStateException("Cannot select Citizen", sql);
        }

        return id;
    }


    public Integer vaccination(DataSource dataSource, String taj) {
        int counter = 0;

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("select status from Vaccinations where citizen_id = ?");

        ) {

            ps.setInt(1, searchCitizenIdBasedOnTaj(dataSource, taj));


            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    counter++;

                }
            } catch (SQLException sql) {
                throw new IllegalArgumentException("No data", sql);
            }

        } catch (SQLException sql) {

            throw new IllegalStateException("Cannot select Citizen based on ID", sql);
        }


        return counter;
    }


    public void firstVaccination(DataSource dataSource, LocalDate date, String type, int id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("insert into Vaccinations(citizen_id, vaccination_date, status, vaccination_type) values (?, ?, ?, ?)");
        ) {
            ps.setInt(1, id);
            ps.setDate(2, java.sql.Date.valueOf(date));
            ps.setString(3, "1");
            ps.setString(4, type);
            ps.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot registration the first vaccina", se);
        }


    }

    public void setTimeOfVaccination(DataSource dataSource, LocalDate date, int id, int numberofvaccination) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("Update citizens set  number_of_vaccination = ?, last_vactination = ? where citizen_id = ? ");
        ) {
            ps.setInt(1, numberofvaccination + 1);
            ps.setDate(2, java.sql.Date.valueOf(date));
            ps.setInt(3, id);
            ps.executeUpdate();


        } catch (SQLException se) {
            throw new IllegalArgumentException("Cannot registration the first vaccina", se);
        }


    }





}





