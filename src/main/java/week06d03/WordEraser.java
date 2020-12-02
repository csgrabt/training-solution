package week06d03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String newWord = "";
        List<String> wordssplitted = Arrays.asList(words.split(" "));
        for(int i = 0; i < wordssplitted.size(); i++){
            if (wordssplitted.get(i).equals(word))
            {}
            else
            {newWord = newWord + wordssplitted.get(i) + " ";}
        }




        return newWord.trim();
    }

}