package hackearRannk;



import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {


        String[] result = new String[s.length()-k+1];

        for(int i = 0; i <s.length()-k+1; i++){
            result[i] = s.substring(i, i+k);
        }
       // Character  c = new Character('c') ;



        System.out.println("b".compareTo("a"));
         System.out.println(Arrays.toString(result));

        String smallest =result[0];
        String largest = result[result.length-1];
        return smallest + "\n" + largest;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava" ;
        int k = 3;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
