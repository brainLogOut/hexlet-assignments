package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
public class App {

    public static void main(String[] args) {
        String text = "java is the best programming language java";

        Map<String, Integer> words = getWordCount(text);

        System.out.println(words);
        System.out.println();
        System.out.println(toString(words));
    }
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) return new HashMap<>();
        String[] splitedSentence = sentence.trim().toLowerCase().split(" ");
        Map<String, Integer> countedWords = new HashMap<>();

        for (String word : splitedSentence) {
            if (countedWords.containsKey(word)) {
                countedWords.replace(word, countedWords.get(word) + 1);
            } else {
                countedWords.put(word, 1);
            }
        }

        return countedWords;
    }

    public static String toString(Map<String, Integer> countedWords) {
        if (countedWords.isEmpty()) return "{}";
        Set<String> keySet = countedWords.keySet();
        StringBuilder mapToString = new StringBuilder();

        mapToString.append("{");
        mapToString.append("\n");
        for (String key : keySet) {
            mapToString.append("  ");
            mapToString.append(key);
            mapToString.append(": ");
            mapToString.append(countedWords.get(key));
            mapToString.append("\n");
        }
        mapToString.append("}");

        return mapToString.toString();
    }
}
//END
