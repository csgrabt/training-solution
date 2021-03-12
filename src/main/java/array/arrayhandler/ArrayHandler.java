package array.arrayhandler;

public class ArrayHandler {
    public boolean contains(int[] source, int itemToFind) {
        for (Integer item : source
        ) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler ah = new ArrayHandler();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        System.out.println(ah.contains(array, 20));
        System.out.println(ah.find(array, 2));
    }
}
