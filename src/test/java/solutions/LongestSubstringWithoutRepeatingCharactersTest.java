package solutions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(Lifecycle.PER_CLASS)
class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters solution;
    Logger logger;

    @BeforeAll
    void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
        logger = LoggerFactory.getLogger(LongestSubstringWithoutRepeatingCharactersTest.class);
        logger.info("before method  executed");
    }

    @Test
    void fiveDifferentStringTest() {
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "aaaaa"})
    void twoTest(String input){
        assertEquals(1, solution.lengthOfLongestSubstring(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aab", "as"})
    void oneTest(String input){
        assertEquals(2, solution.lengthOfLongestSubstring(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"adabcdad", "abcdaad", "wwwert"})
    void fourResult(String input){
        assertEquals(4, solution.lengthOfLongestSubstring(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "aabaab!bb", "pwwkew", "abcabcbb"})
    void threeResultTest(String input){
        assertEquals(3, solution.lengthOfLongestSubstring(input));
    }

    @Test
    void exceptionTest() {
        assertThrows(IllegalArgumentException.class, ()->solution.lengthOfLongestSubstring(""));
        assertThrows(IllegalArgumentException.class, ()->solution.lengthOfLongestSubstring(null));
    }

}