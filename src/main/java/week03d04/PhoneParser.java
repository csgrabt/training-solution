package week03d04;

public class PhoneParser {

private final static String SEPARATOR = "-";

private Phone parse(String str){

    int i = str.indexOf(SEPARATOR);

String a = str.substring(0, i);
String b = str.substring(i+1);

return new Phone(a, Integer.parseInt(b));



}

    public static void main(String[] args) {
        PhoneParser p = new PhoneParser();


        System.out.println(p.parse("12585-12548517").toString());
    }



}
