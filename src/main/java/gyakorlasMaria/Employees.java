package gyakorlasMaria;


import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Employees {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");
        } catch (SQLException se) {
            throw new IllegalStateException("Someting went wrong", se);
        }


        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees (emp_name) values (?)")) {
            stmt.setString(1, "Béla12jgj3");
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("valami", se);
        }


    }
}