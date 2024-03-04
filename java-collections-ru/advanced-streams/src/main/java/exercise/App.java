package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String configFile) {

        return Stream.of(configFile.split("\n"))
                .filter(s -> s.startsWith("environment"))
                .map(App::extractVariables)
                .flatMap(m -> Arrays.stream(m.split(",")))
                .filter(s -> s.startsWith("X_FORWARDED"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }

    public static String extractVariables(String str) {
        return str.replaceAll("environment=", "").replace("\"", "").trim();
    }
}
//END
