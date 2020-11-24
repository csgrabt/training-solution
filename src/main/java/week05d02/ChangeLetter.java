package week05d02;

public class ChangeLetter {
public static final String VOWELS = "aeiou";

    public String changeVowels(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String is null!");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String is Empty!");
        }
        String csereltstr = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (VOWELS.contains(str.substring(i, i+1))) {
                csereltstr = csereltstr + '*';
            } else {
                csereltstr = csereltstr + str.charAt(i);
            }

        }

        return str = csereltstr;
    }


}


