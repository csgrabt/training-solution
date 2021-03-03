package closingproject.businesslogiclayer;

import closingproject.dataacceslayer.CitizenDao;
import org.mariadb.jdbc.MariaDbDataSource;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectConfig {
    private final List<String> menuPoints = List.of("1", "2", "3", "4", "5", "6");
    private final Citizen cz = new Citizen();
    private final Scanner scanner = new Scanner(System.in);
    private final CitizenDao cd = new CitizenDao();

    public CitizenDao getCd() {
        return cd;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public List<String> getMenuPoints() {
        return new ArrayList<>(menuPoints);
    }

    public Citizen getCz() {
        return cz;
    }



    public static MariaDbDataSource createDbConnection(MariaDbDataSource dataSource) {
        try {

            dataSource.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");

        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }
        return dataSource;
    }

}





