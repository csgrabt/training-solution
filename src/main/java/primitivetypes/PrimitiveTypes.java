package primitivetypes;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class PrimitiveTypes {


    public String toBinaryString(int n) {


        Integer[] binary = new Integer[32];


        Integer number = n;
        for (int g = 0; g <= 31; g++) {
            binary[31 - g] = number % 2;
            number = number / 2;

        }


        return makeAString(binary);
    }


    private String makeAString(Integer[] binary) {
        StringBuilder sb = new StringBuilder();


        for (Integer number : binary
        ) {
            sb.append(number);

        }

        return sb.toString();
    }


    public static void main(String[] args) {
        PrimitiveTypes pm = new PrimitiveTypes();
        int number = Integer.MAX_VALUE;
        System.out.println(pm.toBinaryString(number));

        System.out.println(Integer.toBinaryString(number));

    }

}
