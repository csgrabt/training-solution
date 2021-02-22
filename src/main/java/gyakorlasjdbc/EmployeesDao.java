package gyakorlasjdbc;

import gyakorlasDatabase.FileReader;
import gyakorlasDatabase.Teacher;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into employees (emp_name) values(?)")) {

            stmt.setString(1, name);
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("blabla", se);
        }
    }

    public List<String> listEmployeeNames() {
        List<String> names = new ArrayList<>();
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")) {


            while (rs.next()) {
                String name = rs.getString(1);

                names.add(name);

            }


        } catch (SQLException sql) {
            throw new IllegalStateException("Cannot select Employees", sql);
        }
        return names;
    }

}
