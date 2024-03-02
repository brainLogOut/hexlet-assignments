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

        String[] imageOne= {"*", "*", "*", "*"};

        List<String[]> list = Arrays.asList(image);

        List<List<String>> ret = list.stream()
                .map(m -> Arrays.asList(m))
                .toList();

        List<List<String>> ret1 = Arrays.stream(image)
                        .map(arr -> Arrays.asList(arr))
                                .toList();

        //System.out.println(back);

//        List<List<String>> imageInstring = Arrays.stream(Arrays.stream(image)
////                .flatMap(m -> Arrays.stream(m))
//                .map(m -> Arrays.asList(m));
    }
}
// END
