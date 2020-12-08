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


    public static void main(String[] args) {
        System.out.println(sumOfDigits(12));
    }


}
