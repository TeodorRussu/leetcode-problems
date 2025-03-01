package solutions.move_zeroes_283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void moveZeroes() {
        int[] input = {0, 1, 0, 3, 11};
        solution.moveZeroes(input);

        assertEquals(1, input[0]);
        assertEquals(3, input[1]);
        assertEquals(11, input[2]);
        assertEquals(0, input[3]);
        assertEquals(0, input[4]);
    }
}