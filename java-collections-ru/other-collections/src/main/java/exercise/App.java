package exercise;

import java.util.*;

// BEGIN
public  class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        TreeSet<String> unionMapSet = new TreeSet<>(map1.keySet());
        unionMapSet.addAll(map2.keySet());
        Map<String, String> result = new LinkedHashMap<>();

        for (String key : unionMapSet) {
            if (!map1.containsKey(key) && map2.containsKey(key)) {
                result.put(key, "added");
            }
            if (map1.containsKey(key) && !map2.containsKey(key)) {
                result.put(key, "deleted");
            }
            if (map1.containsKey(key) && map2.containsKey(key)
                && !map1.get(key).equals(map2.get(key))) {
                result.put(key, "changed");
            }
            if (map1.containsKey(key) && map2.containsKey(key)
                    && map1.get(key).equals(map2.get(key))) {
                result.put(key, "unchanged");
            }
        }

    return result;
    }
}
//END
