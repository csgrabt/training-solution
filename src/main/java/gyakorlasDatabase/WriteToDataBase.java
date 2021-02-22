package gyakorlasDatabase;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.SQLException;
import java.util.List;

public class WriteToDataBase {

    public static void main(String[] args) {

        String command1 = "insert into teachers(name_of_teacher, topic, class, hours_of_week) values (?, ?, ?, ?)";
        String command2 = "TRUNCATE TABLE teachers";
        String command3 = "ALTER TABLE teachers AUTO_INCREMENT = 25";
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("alma");
        dataSource.setPassword("alma");
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(command1)) {
              // stmt.executeUpdate();

        FileReader fm = new FileReader("ListOfClasses.txt");
        List<Teacher> names = fm.reader();
        for (int i = 0; i < names.size(); i++) {
            stmt.setString(1, names.get(i).getNameOfTeacher());
            stmt.setString(2, names.get(i).getTopic());
            stmt.setString(3, names.get(i).getClasses());
            stmt.setInt(4, names.get(i).getHoursOfWeek());
            stmt.executeUpdate();
           }
        } catch (SQLException se) {
            throw new IllegalStateException("blabla", se);
        }


    }
}
