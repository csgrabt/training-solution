package week07d01.junior;


public class MathAlgorithms {


    public static boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Invalid number!");
        }
        if (x == 1) {
            return false;
        }

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }


}


