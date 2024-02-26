package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String chars, String word) {
        String[] splitedChars = chars.toLowerCase().split("");
        List<String> allowedChar = new ArrayList<>(Arrays.asList(splitedChars));
        String[] splitedWord = word.toLowerCase().split("");
        List<String> wordCharsList = new ArrayList<>(Arrays.asList(splitedWord));

        for (String charFromWord : wordCharsList) {
            if (allowedChar.contains(charFromWord)) {
                allowedChar.remove(charFromWord);
            } else {
                return false;
            }
        }

        return true;
    }
}
//END
