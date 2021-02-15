package gyakorlasDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.SQLException;

public class EmployeesMain {

    public static void main(String[] args) {

     //   MysqlDataSource dataSource = new MysqlDataSource();
//
     //   dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
     //   dataSource.setUser("employees");
     //   dataSource.setPassword("employess");
//
     //   try (Connection conn = dataSource.getConnection();
     //        PreparedStatement stmt =
     //                conn.prepareStatement("insert into employees(emp_name) values (?) ")) {
     //       stmt.setString(1, "Áríztűrő Tükőrfúrógép");
     //       stmt.executeUpdate();
//
     //   } catch (SQLException se) {
     //       throw new IllegalStateException("blabla", se);
     //   }

        Integer i = new Integer(5) ;
        Integer h = 5;
        System.out.println(i==h);

        String string = new String();
        string = "a";

        String str = new String("a");

        System.out.println(str.equals(string));


    }
}
