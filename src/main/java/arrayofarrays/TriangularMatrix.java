package arrayofarrays;

import java.util.Arrays;

public class TriangularMatrix {

    public int[][] triangularMatrix(int size) {
        int[][] array = new int[size + 1][];

        for (int i = 1; i <= size; i++) {
            array[i] = new int[i];

            Arrays.fill(array[i], i - 1);
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }


    public static void main(String[] args) {
        TriangularMatrix triangularMatrix = new TriangularMatrix();
        triangularMatrix.triangularMatrix(10);
    }
}