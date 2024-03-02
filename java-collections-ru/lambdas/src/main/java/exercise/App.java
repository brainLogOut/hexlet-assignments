package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void main(String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] editedMassive = Arrays.stream(image)
                .map(m -> {
                    int newLength = m.length * 2;
                    String[] x2Massive = new String[newLength];

                    for (int i = 0; i < m.length; i++) {
                        x2Massive[i + (m.length / 2)] = m[i];
                    }

                    return x2Massive;
                })
                .toArray(String[][]::new);

        for (String[] strings : editedMassive) {
            System.out.println(Arrays.toString(strings));
        }

//        List<List<String>> ret1 = Arrays.stream(image)
//                        .map(arr -> Arrays.asList(arr))
//                                .toList();

        //System.out.println(back);

//        List<List<String>> imageInstring = Arrays.stream(Arrays.stream(image)
////                .flatMap(m -> Arrays.stream(m))
//                .map(m -> Arrays.asList(m));
    }
}
// END
