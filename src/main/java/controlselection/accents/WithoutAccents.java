package controlselection.accents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithoutAccents {

    private String betuk;










    public static void main(String[] args) {
        WithoutAccents withoutAccents = new WithoutAccents();

        System.out.println("Adja meg a szót amit vesszőtleníteni akar:");

        Scanner scanner = new Scanner(System.in);

        String b = scanner.nextLine();

        String d = b.toLowerCase();
        String e = "";
        for (int i = 0; i < d.length(); i++){

            char c = d.charAt(i);
             if ( c == 'á') { e = e + "a";}else
             if ( c == 'é') { e = e + "e";}else
             if ( c == 'í') { e = e + "i";}else
             if ( c == 'ó') { e = e + "o";}else
             if ( c == 'ö') { e = e + "o";}else
             if ( c == 'ő') { e = e + "o";}else
             if ( c == 'ú') { e = e + "u";}else
             if ( c == 'ü') { e = e + "u";}else
             if ( c == 'ű') { e = e + "u";}
             else { e = e + c;}
        }
        System.out.println(e);

    }



}
