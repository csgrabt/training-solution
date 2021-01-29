/*Írj egy metódust, amely megszámolja, hogy hány különböző betű van
egy szóban. A kis és nagybetűk közötti különbség nem számít!
A space-eket, számjegyeket, stb. ne vegye figyelembe! Csak az
angol ábécé betűit! Majd meg is oldom egyszer settel*/


package week13d05;

import java.util.ArrayList;
import java.util.List;


public class Letter {
    private char first;
    private char last;

    public Letter(char first, char last) {
        this.first = first;
        this.last = last;
    }

    public int letterCounter(String word) {

        List<Character> numberOfCharacter = new ArrayList<>();

        String wordLowerCase = word.toLowerCase();

        for (int i = 0; i < wordLowerCase.length(); i++) {

            char atIndex = wordLowerCase.charAt(i);

            if (first <= atIndex && last >= atIndex) {

                if (!(numberOfCharacter.contains(wordLowerCase.charAt(i)))) {


                    numberOfCharacter.add(wordLowerCase.charAt(i));
                }
            }
        }
        return numberOfCharacter.size();
    }


}
