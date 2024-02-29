package exercise;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5 , 6, 7, 8, 9);

        assertThat(App.take(List.of(), 0))
                .isEqualTo(List.of());

        assertThat(App.take(numbersList, 13))
                .isEqualTo(numbersList);

        assertThat(App.take(numbersList, 5))
                .isEqualTo(List.of(1, 2, 3, 4, 5));
        // END
    }
}
