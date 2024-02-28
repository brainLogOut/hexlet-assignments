package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;
//import java.util.Set;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        List<Map<String, String>> resultList = new ArrayList<>();
        if (books.isEmpty()) return resultList;

        for (Map<String, String> book : books) {

            if (book.get("title").equals(dictionary.getOrDefault("title", book.get("title")))
                && book.get("author").equals(dictionary.getOrDefault("author", book.get("author")))
                && book.get("year").equals(dictionary.getOrDefault("year", book.get("year")))) {

                resultList.add(book);
            }
        }

        return resultList;
    }
}
//END
