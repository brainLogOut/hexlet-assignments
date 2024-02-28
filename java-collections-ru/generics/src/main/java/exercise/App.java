package exercise;

import java.util.*;
//import java.util.Map.Entry;


// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        List<Map<String, String>> resultList = new ArrayList<>();
        if (books.isEmpty()) return resultList;

        Set<String> dictionaryKeySet = dictionary.keySet();

        for (Map<String, String> book : books) {
            boolean check = true;

            for (String key : dictionaryKeySet) {
                if (!dictionary.get(key).equals(book.get(key))) {
                    check = false;
                }
            }

            if (check) {
                resultList.add(book);
            }
        }

        return resultList;
    }
}
//END
