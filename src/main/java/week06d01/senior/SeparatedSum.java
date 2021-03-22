package week06d01.senior;

public class SeparatedSum {
    private static final String REGEX = ";";

    public static Sum sum(String s) {
        double positive = 0.0;
        double negative = 0.0;

        String[] array = s.split(REGEX);

        for (String item : array
        ) {
            double number = stringToDouble(item);
            if (number >= 0) {
                positive += number;
            } else {
                negative += number;
            }
        }


        return new Sum(positive, negative);
    }

    private static double stringToDouble(String item) {
        return Double.parseDouble(item.replace(",", "."));
    }

}
