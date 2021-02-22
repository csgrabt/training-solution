package gyakorlasDatabase;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ReadFromDataBasePreparedStatment {
    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("alma");
        dataSource.setPassword("alma");


        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("select * from teachers where class = ?");

        ) {

             ps.setString(1, "13.a");

            resultSet(ps);


        } catch (SQLException sql) {

            throw new IllegalStateException("Cannot select Employees", sql);
        }


    }

    private static void resultSet(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString(1);
                String name2 = rs.getString(2);
                String name3 = rs.getString(3);
                String name4 = rs.getString(4);
                System.out.println(name);
                System.out.println(name2);
                System.out.println(name3);
                System.out.println(name4);


            }
throw new IllegalArgumentException("No data");
        }
    }


}
