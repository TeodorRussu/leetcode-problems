package solutions.valid_palindrome_125;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    public static List<Arguments> testDataProvider() {
        return List.of(
                Arguments.of("A man, a plan, a canal: Panama", true)
                );
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void isPalindrome(String input, boolean expectedOutput) {
        boolean actualOutput = solution.isPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }
}