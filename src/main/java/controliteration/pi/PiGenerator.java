package controliteration.pi;

public class PiGenerator {


        int c = 0;



    String vers =
            "Nem a régi s durva közelítés, mi szótól szóig így kijön betűiket számlálva. Ludolph eredménye már, ha itt végezzük húsz jegyen. De rendre kijő még tíz pontosan, Azt is bízvást ígérhetem.";
    String vers2 ="";
    boolean a;

 public String getPi() {
     for (int i = 0; i < vers.length(); i++) {
         if (vers2.length() == 1) {
             vers2 = vers2 + '.';
         }
         a = vers.charAt(i) == '.' || vers.charAt(i) == ' ' || vers.charAt(i) == ',';
         if (a) {
             if (c != 0) {
                 vers2 = vers2 + c;
                 c = 0;
             }
         }
         if (!a) {
             c++;
         }
     }
return vers2;
 }








}
