import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/input.csv")
    @Disabled
    void testWithCSVSource(String first, int second) {
        System.out.println("Param test with (String) "
                + first + " and (int) " + second
        );
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @DisplayName("Test container")
    @ParameterizedTest(name = "[{index}] first arg=\"{0}\", sec arg={1}")
    @CsvSource({"przerwa,1", "przerwa,2", "testy,3"})
    void testWithCustomDisplayName(String first, int second) {
        System.out.println("Testing with params...");
    }

    @RepeatedTest(3)
    void test() {
        System.out.println("Powtórzony test");
    }

    @RepeatedTest(value = 2, name = "{displayName} -  {currentRepetition} / {totalRepetitions}")
    @DisplayName("Powtórki")
    void customDisplayName(TestInfo testInfo) {
        System.out.println("Powtórzony test");
    }

}
