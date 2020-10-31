package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {


        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;

        System.out.println(message);

    boolean b = message.equals("Hello John Doe");
    boolean c = message.equals("Hello John Doe444");

    String empty = "" + "";

        System.out.println(empty.length());

        String string = "Abcde";
        System.out.println(string.length());
        System.out.println(string.substring(0,1) + " " + string.substring(2,3));
        System.out.println(string.substring(0,3));



    }
}