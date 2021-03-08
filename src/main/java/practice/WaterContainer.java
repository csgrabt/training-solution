package practice;

public class WaterContainer {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int area;

    public WaterContainer() {
        super();
    }

    public WaterContainer(int x1, int y1, int x2, int y2, int area) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public WaterContainer areas(int[] array) {
        WaterContainer waterContainer = new WaterContainer(0, 0, 0, 0, 0);
        for (int i = 0; i < array.length; i++) {
            for (int g = i; g < array.length; g++) {
                int b;
                int a = g - i;
                if (array[i] >= array[g]) {
                    b = array[g];
                } else {
                    b = array[i];
                }
                if ((a*b) > waterContainer.getArea()) {
                    waterContainer = new WaterContainer(
                            i, array[i], g, array[g], (a*b)
                    );
                }
            }
        }
        return waterContainer;}


    public static void main(String[] args) {
        WaterContainer waterContainer = new WaterContainer();

        int[] numbers = new int[14];
        numbers[0] = 1;
        numbers[1] = 8;
        numbers[2] = 6;
        numbers[3] = 2;
        numbers[4] = 5;
        numbers[5] = 4;
        numbers[6] = 8;
        numbers[7] = 4;
        numbers[8] = 7;
        numbers[9] = 7;
        numbers[10] = 2;
        numbers[11] = 3;
        numbers[12] = 4;
        numbers[13] = 6;


        System.out.println(waterContainer.areas(numbers));

    }


    @Override
    public String toString() {
        return "WaterContainer{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", area=" + area +
                '}';
    }
}







