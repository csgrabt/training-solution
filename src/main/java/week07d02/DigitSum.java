package week07d02;

public class DigitSum {


public static int sumOfDigits(int x){
    String number = x + "";
    int sumOfDigits = 0;
    for (int i = 0; i < number.length(); i++){
       char numberDigitChar = number.charAt(i);
       String numberDigitString = numberDigitChar + "";
       int numberDigitInt = Integer.parseInt(numberDigitString);

       sumOfDigits += numberDigitInt;
    }



return sumOfDigits;}





    public static int sumOfDigits2(int x) {

        String szamjegyek = Integer.toString(x);
        int sum = 0;

        for (int i = 0; i < szamjegyek.length(); i++) {
            sum += (Integer.parseInt(szamjegyek.substring(i, i + 1)));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits2(112));
    }


}
