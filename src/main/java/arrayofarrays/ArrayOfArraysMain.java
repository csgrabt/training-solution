package arrayofarrays;

public class ArrayOfArraysMain {

    private int size;

    public int[][] multiplicationTable(int size) {
        int[][] b = new int[size][size];
        for (int i = 0; i < size; i++){
            for( int j=0; j < size; j++){
                b[i][j] = (i+1)*(j+1);
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        return b;



    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        arrayOfArraysMain.multiplicationTable(5);


    }
}

