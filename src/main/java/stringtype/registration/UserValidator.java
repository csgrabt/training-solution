package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        boolean d = username == null;
        boolean a = username.length() > 0;
        boolean g = a  && !d;
        return g;


    }

    public boolean isValidPassworld(String p1, String p2) {
        boolean a = p1 == null;
        boolean b = p1.equals(p2);
        boolean c = p1.length() > 7;
        boolean d = !a && b && c;
        return d;
    }
public boolean isValidEmail(String email){

       return  !(0 == email.indexOf("@"))
               && !(email.length() == email.indexOf("."))
               && !(email.indexOf("@") + 1 == email.indexOf("."))
               && email.indexOf("@")  < email.indexOf(".");


}
}
