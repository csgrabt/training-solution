package introexception;

import java.security.PrivilegedExceptionAction;

public class SsnValidator {

    public static final int LENGTHOFSSN = 9;

    public boolean isValidSsn(String ssn) {
 boolean vegso = false;
        boolean hossz = ssn.length() == LENGTHOFSSN;

        int b = ssn.length();
        int paros = 0;
        int paratlan = 0;

        for (int i = 1; i < b-1; i = i + 2) {
            int d;
            try {
                d = Integer.parseInt("" + ssn.charAt(i));
            } catch (NumberFormatException e) {
                return false;
             }
            paros += (d * 7);
        }
        for (int i = 0; i < b-1; i = i + 2) {
            int d;
            try {
                d = Integer.parseInt("" + ssn.charAt(i));
            } catch (NumberFormatException e) {
                return false;
            }
            paratlan += (d * 3);

        }
        boolean osztas = (paros + paratlan) % 10 == Integer.parseInt("" + ssn.charAt(b-1));

        if (hossz == true && osztas == true) {
            vegso = true;
        }

return vegso;
    }


}
