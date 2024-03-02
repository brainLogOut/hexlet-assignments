package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> mens) {

        return mens.stream()
                .filter((u) -> u.get("gender").equals("male"))
                .sorted(Comparator.comparing(u -> LocalDate.parse(u.get("birthday"))))
//                .sorted((u2, u1) -> {
//                    LocalDate men1Birthday = LocalDate.parse(u1.get("birthday"));
//                    LocalDate men2Birthday = LocalDate.parse(u2.get("birthday"));
//
//                    return men1Birthday.compareTo(men2Birthday);
//                })
                .map((u) -> u.get("name"))
                .toList();
    }
}
// END
