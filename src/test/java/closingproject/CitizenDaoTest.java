package closingproject;

import closingproject.businesslogiclayer.Citizen;
import closingproject.dataacceslayer.CitizenDao;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CitizenDaoTest {
    MariaDbDataSource dataSource = new MariaDbDataSource();
    CitizenDao cd = new CitizenDao();
    Citizen citizen;
    Flyway flyway;
    MariaDbDataSource dataSource1 = new MariaDbDataSource();

    @BeforeEach
    void setTest() {
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");
        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }
        try {
            dataSource1.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource1.setUser("alma");
            dataSource1.setPassword("alma1");
        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }

        flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
        citizen = new Citizen("Kiss Géza", "1007", 35, "m@m", "000000000", dataSource);
    }


    @Test
    void zipCodeTestOK() {
        assertEquals("Budapest", cd.findCityByZipcode(dataSource, "1007"));
        assertEquals("Mezőtúr", cd.findCityByZipcode(dataSource, "5400"));
    }

    @Test
    void zipCodeTestZipIsNotExits() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.findCityByZipcode(dataSource, "1000");
        });
        assertEquals("Db does not contain the ZipCode!", ex.getMessage());
    }

    @Test
    void zipCodeTestDataBaseConnectionFailed() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.findCityByZipcode(dataSource1, "1007");
        });
        assertEquals("Access denied for user 'alma'@'localhost' (using password: YES)", ex1.getMessage());
    }

    @Test
    void writeRegistrationToDb() {
        cd.writeRegistrationToDB(dataSource, citizen);

        assertEquals(1, cd.searchCitizenIdBasedOnTaj(dataSource, "000000000"));
    }


    @Test
    void writeRegistrationToDbConnectionFailed() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegistrationToDB(dataSource1, citizen);
        });
        assertEquals("Something went wrong during writing database", ex1.getMessage());
    }

    @Test
    void writeRegisterFromFileToDbTest() {
        cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", ";");
        assertEquals(1, cd.searchCitizenIdBasedOnTaj(dataSource, "123456788"));
        assertEquals(2, cd.searchCitizenIdBasedOnTaj(dataSource, "123456795"));
        assertEquals(3, cd.searchCitizenIdBasedOnTaj(dataSource, "123456805"));
        assertEquals(4, cd.searchCitizenIdBasedOnTaj(dataSource, "123456812"));
        assertEquals(5, cd.searchCitizenIdBasedOnTaj(dataSource, "123456829"));
        assertEquals(6, cd.searchCitizenIdBasedOnTaj(dataSource, "123456836"));
    }

    @Test
    void writeRegisterFromFileToDbTestBadRegex() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", "\n");
        });
        assertEquals("Rollback, there is an error in the 2th line!", ex1.getMessage());
    }


    @Test
    void writeRegisterFromFileToDbTestBadPath() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject", ";");
        });
        assertEquals("Rollback, there is an error in the 1th line!", ex1.getMessage());
    }

    @Test
    void writeRegisterFromFileToDbTestSQLConnectionFailed() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource1, "TestClosingProject.txt", ";");
        });
        assertEquals("Access denied for user 'alma'@'localhost' (using password: YES)", ex1.getMessage());
    }

    @Test
    void numberOfVaccination() {
        cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", ";");
        assertEquals(0, cd.numberOfVaccination(dataSource, "123456812"));

    }

    @Test
    void numberOfVaccinationSQLConnectionFailed() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", ";");
            cd.numberOfVaccination(dataSource1, "123456812");
        });
        assertEquals("Access denied for user 'alma'@'localhost' (using password: YES)", ex1.getMessage());

    }

    @Test
    void numberOfVaccinationTableNotContainedTajLengthIsWrong() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", ";");
            cd.numberOfVaccination(dataSource, "1234568120");
        });
        assertEquals("The length of the insurance number is wrong!", ex1.getMessage());

    }

    @Test
    void numberOfVaccinationTableNotContainedTaj() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegisterFromFileToDb(dataSource, "TestClosingProject.txt", ";");
            cd.numberOfVaccination(dataSource, "000000000");
        });
        assertEquals("The Database does not contained this TAJ number!", ex1.getMessage());

    }


    @Test
    void vaccinationSetTimeAndTypeAllIsOK() {
        cd.writeRegistrationToDB(dataSource, citizen);
        cd.vaccinationSetTimeAndType(dataSource, LocalDate.now(), "finom", 1, "OK", 1);
        assertEquals("finom", cd.typeOfVaccination(dataSource, "000000000"));
    }


    @Test
    void vaccinationSetTimeAndTypeRollBackTest() {
        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cd.writeRegistrationToDB(dataSource, citizen);
            cd.vaccinationSetTimeAndType(dataSource, LocalDate.now(), "finom", 1, "OK", 3);

        });
        assertEquals("Túl sok oltás: 3!", ex1.getMessage());

    }

    @Test
    void dateOfVaccinationTest() {
        cd.writeRegistrationToDB(dataSource, citizen);
        cd.vaccinationSetTimeAndType(dataSource, LocalDate.of(2020, 01, 30), "finom", 1, "OK", 1);
        assertEquals("2020-01-30 00:00:00.0", cd.dateOfVaccination(dataSource, "000000000"));
    }

    @Test
    void dateOfVaccinationTajIsNotExitsInTheTable() {
        cd.writeRegistrationToDB(dataSource, citizen);
        cd.vaccinationSetTimeAndType(dataSource, LocalDate.of(2020, 01, 30), "finom", 1, "OK", 1);
        assertEquals(null, cd.dateOfVaccination(dataSource, "000000001"));
    }
}