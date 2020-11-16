package stringscanner;

import java.util.Scanner;

public class StringScanner {






    public int readAndSumValues(String intString, String delimiter){

        int b = 0;
        int i = 0;
        if (delimiter == null){
            for (int j = 0; j < intString.length(); j++){
                char a =  intString.charAt(j);
                int c = (int) a ;
                if(c!=32 && (c < 48 || c > 57) ){throw new IllegalArgumentException("Incorrect parameter string!");}}

                {
                    Scanner s = new Scanner(intString);

                    while (s.hasNextInt()){
                    i += s.nextInt();}
                    return  i;
        }}

        String h = intString.replace(delimiter,"");
        for (int k = 0; k < h.length(); k++){
            char a =  h.charAt(k);
            int c = (int) a ;
            if(c < 48 || c > 58){throw new IllegalArgumentException("Incorrect parameter string!");}}






        Scanner d = new Scanner(intString).useDelimiter(delimiter);
    while (d.hasNextInt()){
        b += d.nextInt();
    }





        return b;}




    public int readAndSumValues(String intString){return 5;}

    public String filterLinesWithWordOccurrences(String text, String word){
String b = null;
        return b;}


}

