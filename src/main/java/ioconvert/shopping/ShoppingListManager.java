package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {


    public void saveShoppingList(OutputStream outputStream, List<String> list) {


        PrintStream ps = new PrintStream(outputStream);

        for (String name : list
        ) {
            ps.println(name);

        }

    }

    public List<String> loadShoppingList(InputStream inputStream) {
        List<String> list = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(inputStream);

        try (BufferedReader bf = new BufferedReader(isr)) {

            String line;

            while ((line = bf.readLine()) != null) {
                list.add(line);
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong!", ioe);
        }


        return list;
    }


}
