package week11d01;

public class DivisorFinder {


    public int findDivisors(int i) {
        int counter = 0;

        String number = i + "";

        for (int g = 0; g < number.length(); g++) {
            if (i % Integer.parseInt(number.substring(g, g + 1)) == 0) {
                counter++;
            }
        }


        return counter;
    }


    public static void main(String[] args) {

 DivisorFinder divisorFinder = new DivisorFinder();

        System.out.println(divisorFinder.findDivisors(425));

    }


}