/*Írj egy metódust, amely megszámolja, hogy hány különböző betű van
egy szóban. A kis és nagybetűk közötti különbség nem számít!
A space-eket, számjegyeket, stb. ne vegye figyelembe! Csak az
angol ábécé betűit! Majd meg is oldom egyszer settel*/


package week13d05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Letter {
    private int min;
    private int max;

    public Letter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int letterCounter(String word) {

        List<Character> numberOfCharacter = new ArrayList<>();

        String wordLowerCase = word.toLowerCase();

        for (int i = 0; i < wordLowerCase.length(); i++) {

            int number = wordLowerCase.charAt(i);

            if (min <= number && max >= number) {

                if (!(numberOfCharacter.contains(wordLowerCase.charAt(i)))) {


                    numberOfCharacter.add(wordLowerCase.charAt(i));
                }
            }
        }
        return numberOfCharacter.size();
    }


}
