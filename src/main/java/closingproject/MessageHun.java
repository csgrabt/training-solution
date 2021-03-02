package closingproject;

public class MessageHun {
    public static void menuPrintln4() {
        System.out.println("Mit kíván tenni? \n Üssön 1-est majd entert, hogy visszatérjen a főmenübe! \n Minden más karakter bevitelével kilép a programból!");
    }

    public static void menuPrintln3() {
        System.out.println("Nem létező menüpont!");
    }

    public static void menuPrintln2() {
        System.out.println("Adja meg, mit szeretne tenni:");
    }

    public static void menuPrintln1() {
        System.out.println(
                "1. Regisztráció" + "\n" +
                        "2. Tömeges regisztráció" + "\n" +
                        "3. Generálás" + "\n" +
                        "4. Oltás" + "\n" +
                        "5. Oltás meghiúsulás" + "\n" +
                        "6. Riport");
    }
}
