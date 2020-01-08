package solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    ContainerWithMostWater solution;

    @BeforeEach
    void setUp() {
        solution = new ContainerWithMostWater();
    }

    @Test
    void maxArea() {
        int expected = 49;
        int[] input = new int[]{
            1, 8, 6, 2, 5, 4, 8, 3, 7
        };

        Assertions.assertEquals(expected, solution.maxArea(input));
    }
}