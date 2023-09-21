package solutions.letter_combination_phone_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testHappyCase_23() {
        var expectedOutput = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        var actualOutput = solution.letterCombinations("23");
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyInput() {
        var expectedOutput = Collections.emptyList();
        var actualOutput = solution.letterCombinations("");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testHappyInput_2() {
        var expectedOutput = List.of("a", "b", "c");
        var actualOutput = solution.letterCombinations("2");

        assertEquals(expectedOutput, actualOutput);
    }

}
