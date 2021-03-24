package week06d03.junior;

public class WordEraser {
    public static final String REGEX = " ";

    public String eraseWord(String words, String word) {
        StringBuilder newWord = new StringBuilder();
        String[] stringToList = words.split(REGEX);

        for (String s : stringToList) {
            if (!s.equals(word)) {
                newWord.append(s).append(REGEX);
            }
        }
        return newWord.toString().trim();
    }
}