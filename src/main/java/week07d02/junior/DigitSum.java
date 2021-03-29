package week07d02.junior;

public class DigitSum {


    public static int sumOfDigits(int x) {
        String number = x + "";
        int sumOfDigits = 0;
        for (int i = 0; i < number.length(); i++) {
            char numberDigitChar = number.charAt(i);
            String numberDigitString = numberDigitChar + "";
            int numberDigitInt = Integer.parseInt(numberDigitString);

            sumOfDigits += numberDigitInt;
        }
        return sumOfDigits;
    }


    public static int sumOfDigits2(int x) {

        String digits = Integer.toString(x);
        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            sum += (Integer.parseInt(digits.substring(i, i + 1)));
        }
        return sum;
    }

    public static int sumOfDigits3(int x) {
        int sum = 0;
        char[] numbers = Integer.toString(x).toCharArray();

        for (char item : numbers
        ) {
            sum += Integer.parseInt(Character.toString(item));

        }

        return sum;
    }


    public static int sumOfDigits4(int x) {

        int lengthOfNumber = 0;

        do {
            lengthOfNumber++;
        }

        while ((x / (int) (Math.pow(10, lengthOfNumber))) != 0);


        int sumOfDigit = 0;

        for (int i = lengthOfNumber; i != 0; i--) {
            int digit = x / (int) (Math.pow(10, (i - 1)));
            x = x - (digit * (int) Math.pow(10, (i - 1)));
            sumOfDigit += digit;
        }


        return sumOfDigit;
    }
}


