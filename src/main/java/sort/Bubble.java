package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubble {


    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {

        for (int j = list.size(); j > 0; j--) {

            for (int i = 1; i < j; i++) {

                if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                    T first = list.get(i - 1);
                    T second = list.get(i);
                    list.set(i, first);
                    list.set(i - 1, second);
                }
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(13, 14, 15, 16, 17, 12, 5, 4, 2, 1, 9, 0, 11));

        bubbleSort(integerList);

        System.out.println(integerList);


        List<String> stringList = new ArrayList<>(Arrays.asList("Körte", "Barack", "Citrom", "Alma"));

        bubbleSort(stringList);

        System.out.println(stringList);


        List<Apple> appleList = new ArrayList<>(List.of(
                new Apple(5),
                new Apple(3),
                new Apple(2)
        ));
        bubbleSort(appleList);
        System.out.println(appleList);


        List<Color> colorList = new ArrayList<>(List.of(
                new Color("Kék"),
                new Color("Piros"),
                new Color("Fehér")
        ));


        bubbleSort(colorList);

        System.out.println(colorList);


    }
}

class Apple implements Comparable<Apple> {

    private int size;

    public Apple(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Apple o) {
        return this.size - o.size;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                '}';
    }
}

class Color implements Comparable<Color> {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Color o) {
        return this.name.compareTo(o.name);
    }


}