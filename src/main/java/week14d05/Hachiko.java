package week14d05;

import week10d05.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Hachiko {

    public Map<String, Integer> countWords(String filename, String... strings) {

        Map<String, Integer> mapOfWords = new HashMap<>();

        List<String> words = new ArrayList<>();

        fillHashMapByZero(mapOfWords, words, strings);

        Path path = Path.of(filename);

        readingFile(mapOfWords, words, path);


        return mapOfWords;
    }

    private void readingFile(Map<String, Integer> mapOfWords, List<String> words, Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;

            fillHashMapByValues(mapOfWords, words, bf);


        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong", ioe);
        }
    }

    private void fillHashMapByValues(Map<String, Integer> mapOfWords, List<String> words, BufferedReader bf) throws IOException {
        String line;
        while ((line = bf.readLine()) != null) {

            for (String item : words
            ) {

                if (blablabla(line).contains(item)) {


                    mapOfWords.replace(item, mapOfWords.get(item) + 1);

                }

            }
        }
    }

    private void fillHashMapByZero(Map<String, Integer> mapOfWords, List<String> words, String[] strings) {
        for (String item : strings
        ) {
            words.add(item);
            mapOfWords.put(item, 0);
        }
    }


    private List<String> blablabla(String string) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (Character.isAlphabetic(letter)) {
                sb.append(letter);
            } else {
                sb.append(" ");
            }

        }


        return blabla(sb.toString().split(" "));
    }


    private List<String> blabla(String[] strings) {
        List<String> string = new ArrayList<>();

        for (String item : strings
        ) {
            if (!item.isEmpty()) {
                string.add(item);
            }

        }

        return string;
    }


    public static void main(String[] args) {
        Hachiko hachiko = new Hachiko();


        System.out.println(hachiko.countWords("Hachiko.str", "Hachiko", "haza", "jó", "pályaudvar", "kutya"));


        System.out.println(hachiko.blablabla("Okos fiú! Ügy.es, vagy!"));


    }


}
