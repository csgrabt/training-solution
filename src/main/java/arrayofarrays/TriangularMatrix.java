package arrayofarrays;

import java.util.Arrays;
import java.util.Random;

public class TriangularMatrix {

    public int[][] triangularMatrix(int size) {
        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            array[i] = new int[i + 1];

            {
                Arrays.fill(array[i], i);
            }
        }
        return array;
    }


    public static void main(String[] args) {
        TriangularMatrix triangularMatrix = new TriangularMatrix();
        int[][] array = triangularMatrix.triangularMatrix(5);

        System.out.println(Arrays.deepToString(array));

        int[] numbers = {2, 6, 3, 9, 10, 4};

        int[] secondPart = Arrays.copyOfRange(numbers, 3, 6);


        System.out.println(Arrays.toString(secondPart));



    }
}