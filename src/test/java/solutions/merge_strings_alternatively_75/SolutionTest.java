package solutions.merge_strings_alternatively_75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void mergeAlternately() {
        String expected = solution.mergeAlternately("abc", "pqrst");
        assertEquals("apbqcrst", expected);
    }
}