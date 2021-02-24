package gyakorlasjdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import gyakorlasDatabase.FileReader;
import gyakorlasDatabase.Teacher;
import gyakorlasLambda.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) {


        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("alma");
        dataSource.setPassword("alma");

        EmployeesDao eD = new EmployeesDao(dataSource);
        eD.createEmployee("Jhon Doe");
        List<String> names = eD.listEmployeeNames();
        System.out.println(names);
    }
}
