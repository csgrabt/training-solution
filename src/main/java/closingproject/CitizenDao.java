package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CitizenDao {
    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {

            dataSource.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");

        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }


        try (BufferedReader bf = Files.newBufferedReader(Path.of("zipcodes.csv"))) {

            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {

                String[] data = line.split(";");

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
                    throw new IllegalArgumentException("Something went wrong during writing database");
                }


            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong during reading file!");
        }


    }


}
