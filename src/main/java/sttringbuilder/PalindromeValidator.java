package sttringbuilder;

public class PalindromeValidator {



 public boolean isPalindrome(String string){
if (string == null){throw new IllegalArgumentException("Text must not be null!");}
StringBuilder stringBuilder = new StringBuilder(string);
String s = stringBuilder.toString().trim().toLowerCase();
String d = stringBuilder.reverse().toString().trim().toLowerCase();

return s.equals(d);

}


}
