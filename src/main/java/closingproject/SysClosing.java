package closingproject;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SysClosing {
    private final List<String> menuPoints = List.of("1", "2", "3", "4", "5", "6");
    private final Citizen cz = new Citizen();
    private MariaDbDataSource dataSource = new MariaDbDataSource();
    private final CitizenDao cd = new CitizenDao();


    public SysClosing() {
        this.dataSource = createDbConnection(dataSource);
    }

    public List<String> getMenuPoints() {
        return new ArrayList<>(menuPoints);
    }

    public Citizen getCz() {
        return cz;
    }

    public void setDataSource(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public MariaDbDataSource getDataSource() {
        return dataSource;
    }

    public CitizenDao getCd() {
        return cd;
    }

    private static MariaDbDataSource createDbConnection(MariaDbDataSource dataSource) {
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





