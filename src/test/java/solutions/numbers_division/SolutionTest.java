package solutions.numbers_division;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @CsvSource({
            "24, 6, 4",
            "-1, 1, -1",
            "7, -3, -2",
            "-7, -3, 2",
            "-2147483648, -1, 2147483647",
            "-2147483648, -3, 715827882",
            "-2147483648, 2, -1073741824",
            "2147483647, -2147483648, 0",
            "-2147483648, -2147483648, 1",


    })
    void testSolutionHappyNumber(int divident, int divisor, int expected){
        var actualOutput = solution.divide(divident, divisor);
        Assertions.assertEquals(expected, actualOutput);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 3, 3",
    })
    void testSolutionUnique(int divident, int divisor, int expected){
        var actualOutput = solution.divide(divident, divisor);
        Assertions.assertEquals(expected, actualOutput);
    }
}