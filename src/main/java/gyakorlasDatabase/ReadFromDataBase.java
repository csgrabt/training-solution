package gyakorlasDatabase;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromDataBase {
    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("alma");
        dataSource.setPassword("alma");


        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select class, topic from teachers"))
         {
             List<String> names = new ArrayList<>();
             List<String> classes = new ArrayList<>();

             while(rs.next()){
               String name =  rs.getString("topic");
               String nam1 = rs.getString(1);
               names.add(name);
               classes.add(nam1 + "\n");
             }

             System.out.println(names);
             System.out.println(classes);


    }catch (SQLException sql){
            throw new IllegalStateException("Cannot select Employees", sql);
        }


    }


}
