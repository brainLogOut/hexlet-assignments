package exercise;

import java.util.Arrays;

// BEGIN
public class App {

    public static String[][] enlargeArrayImage(String[][] image) {

        return Arrays.stream(image)
                .map(App::duplicateValues)
                .flatMap(m -> Arrays.stream(new String[][] {m, m}))
                .toArray(String[][]::new);
    }

    public static String[] duplicateValues(String[] items) {

        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }
}
// END
