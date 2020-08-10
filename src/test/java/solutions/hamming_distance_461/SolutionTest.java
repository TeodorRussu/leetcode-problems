package solutions.hamming_distance_461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    private void init(){
        solution = new Solution();
    }

    @Test
    void hammingDistance() {
        Assertions.assertEquals(2, solution.hammingDistance(2, 4));
        Assertions.assertEquals(4, solution.hammingDistance(6, 9));
        Assertions.assertEquals(5, solution.hammingDistance(19, 235));
        Assertions.assertEquals(17, solution.hammingDistance(10000, 985541254));
        Assertions.assertEquals(3, solution.hammingDistance(3, 31));
    }
}