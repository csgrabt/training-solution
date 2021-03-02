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

    public static void fistMenuPrintln13() {
        System.out.println("Hiba történt az adatbázis írása sorám (Esetleg az adatbázis már tartalmazza a taj számot)!");
    }

    public static void fistMenuPrintln12() {
        System.out.println("Hibás taj szám!");
    }

    public static void fistMenuPrintln11() {
        System.out.println("Adja meg a TAJ számot!");
    }

    public static void fistMenuPrintln10() {
        System.out.println("Az email formátuma nem megfelelő");
    }

    public static void fistMenuPrintln9() {
        System.out.println("Ismételje  meg az email címet!");
    }

    public static void fistMenuPrintln8() {
        System.out.println("Adja meg az email címet!");
    }

    public static void fistMenuPrintln7() {
        System.out.println("A két eamik cím nem egyezik!");
    }

    public static void fistMenuPrintln6() {
        System.out.println("Az életkort számmal kell megadni, ne legyen szóköz a végén!");
    }

    public static void fistMenuPrintln5() {
        System.out.println("Adja meg az életkort!");
    }

    public static void fistMenuPrintln4(String zipCode) {
        System.out.println("A táblázat nem tartalmazza a megadott irányító számot " + zipCode);
    }

    public static void fistMenuPrintln3() {
        System.out.println("Adja meg az irányítószámot!");
    }

    public static void firstMenuPrintln2() {
        System.out.println("Helytelen név páciens nevét!");
    }

    public static void firstMenuPrintln1() {
        System.out.println("Adja meg a páciens nevét!");
    }
    public static String secondExeptionMassege1() {
        return "A fájl nem létezik!";
    }

    public static void secondMenuPritnln4(ArrayIndexOutOfBoundsException ie) {
        System.out.println(ie.toString() + " Hiba a feldolgozás közben");
    }

    public static void secondMenuPritnln3(IllegalArgumentException ioe) {
        System.out.println(" A művelet egy hiba miatt megszakadt!" + ioe);
    }

    public static void secondMenuPritnln2() {
        System.out.println("Adja meg az elválasztó karaktert a fájlon belül!");
    }

    public static void secondMenuPritnln1() {
        System.out.println("Adja meg a fájl elérési útvonalát(pl: C:/alma/alma.txt)!");
    }
}
