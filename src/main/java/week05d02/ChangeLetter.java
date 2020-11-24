package week05d02;

public class ChangeLetter {



public String changeVowels(String str){
    if( str == null){ throw new IllegalArgumentException("String is null!");}
    if( str.isEmpty()){ throw new IllegalArgumentException("String is Empty!");}
    String csereltstr = "";
    int stringLenght = str.length();
    str = str.toLowerCase();
    for (int i = 0; i < stringLenght; i++){
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u'){csereltstr = csereltstr + '*';}else{csereltstr = csereltstr + str.charAt(i);}

    }

    return str = csereltstr;}




    }


