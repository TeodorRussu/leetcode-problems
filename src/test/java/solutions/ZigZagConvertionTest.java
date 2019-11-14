package solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConvertionTest {

    private ZigZagConvertion solution;

    @BeforeEach
    void setUp() {
        solution = new ZigZagConvertion();
    }

    @Test
    void testAB() {
        System.out.println(solution.convert("PAYPALISHIRING", 1));
    }
}