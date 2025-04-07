package solutions.max_vovels_in_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void maxVowels() {
        int output = solution.maxVowels("tryhard", 4);
        Assertions.assertEquals(1, output);
    }
}