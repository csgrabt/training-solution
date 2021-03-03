package closingproject.businesslogiclayer;

import closingproject.dataacceslayer.CitizenDao;
import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;

public class FifthMenuMethods {
    private static final CitizenDao cd = new CitizenDao();

    public static void failedVaccinationRegister(String taj, String note, String date, String status) {
        try {
            int citizen_id = cd.searchCitizenIdBasedOnTaj(cd.getDataSource(), taj);
            LocalDate timeToDB = LocalDate.parse(date);
            cd.failedVaccination(cd.getDataSource(), timeToDB, note, citizen_id, status);

        } catch (Exception ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
