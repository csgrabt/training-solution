package week12d04;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SecretMessage {


    public char[] readBytesAndFindAs(String s) {

        Path path = Path.of(s);

        byte[] buffer;

        try (InputStream ip = Files.newInputStream(path)) {

            buffer = ip.readAllBytes();


        } catch (IOException ie) {
            throw new IllegalStateException("Cannot read file", ie);
        }

byteWriter(intToChar(arrayAdd10(buffer)), "result.txt");
        return intToChar(arrayAdd10(buffer));
    }


    private int[] arrayAdd10(byte[] array) {
        int[] add100 = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            add100[i] = array[i] + 10;


        }

        return add100;
    }


    private char[] intToChar(int[] array) {
        char[] charArray = new char[array.length];


        for (int i = 0; i < array.length; i++) {
            charArray[i] = (char) array[i];


        }

        return charArray;
    }


    private void byteWriter(char[] array, String string) {

        Path file = Path.of(string);

        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))) {
            for (int i = 0; i < array.length; i++) {
                printWriter.print(array[i]);
            }


        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }


    public static void main(String[] args) {
        SecretMessage sm = new SecretMessage();

        System.out.println(Arrays.toString(sm.readBytesAndFindAs("secret.dat")));


    }


}
