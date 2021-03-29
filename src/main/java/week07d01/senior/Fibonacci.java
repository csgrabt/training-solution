package week07d01.senior;

public class Fibonacci {


    public static long fib(int n) {
        if (n == 0) {
            return 0L;
        }
        long[] numbers = new long[]{0L, 1L};

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                numbers[0] = sumNumbers(numbers);
            } else {
                numbers[1] = sumNumbers(numbers);
            }


        }
        return sumNumbers(numbers);
    }

    private static long sumNumbers(long[] numbers) {
        return numbers[0] + numbers[1];
    }

}
