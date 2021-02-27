package gyakorlas2;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.net.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UrlReader {

    public static final char[] ARRAY_FINAL = {'a', 'b', 'e', 'f', '1', 'v', 'g'};

    public static void main(String[] args) throws Exception {


        for (int i = 0; i < ARRAY_FINAL.length; i++) {

            int counter = 0;
            URL index = new URL("https://index.hu");
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(index.openStream()))) {

                String inputLine;
                while ((inputLine = in.readLine()) != null) {


                    char[] array = inputLine.toCharArray();


                    for (Character item : array
                    ) {
                        if (item.equals(ARRAY_FINAL[i])) {
                            counter++;
                        }
                    }

                }


            } catch (IOException ioe) {
                throw new IllegalStateException("Something went wrong");
            }
            System.out.println(ARRAY_FINAL[i] + "" + counter);

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/CaracterCalculatorResult?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");

            try (Connection conn = dataSource.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("insert into result(word, numberOfChar ) values (?, ?)")) {
                stmt.setString(1,String.valueOf(ARRAY_FINAL[i]));
                stmt.setInt(2, counter);

                 stmt.executeUpdate();

            } catch (SQLException se) {
                throw new IllegalStateException("blabla", se);
            }




        }
    }

}



