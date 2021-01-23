package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        if (words == null) {
            throw new IllegalArgumentException("List is null");
        }
        List<String> wordWithC = new ArrayList<>();

        for (String word : words
        ) {
            if (word.indexOf(c) > -1) {
                wordWithC.add(word);
            }

        }

        return wordWithC;

    }

}
