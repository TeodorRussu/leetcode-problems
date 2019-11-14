package solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private ReverseInteger solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseInteger();
    }



    @Test
    void testBig() {
        assertEquals(0, solution.reverse(1534236469));
    }
    @Test
    void testOneTwoThree() {
        assertEquals(-321, solution.reverse(-123));
    }
    @Test
    void testBigNeg() {
        assertEquals(-109, solution.reverse(-901000));
    }

    @Test
    void testRes() {
        assertEquals(-321, solution.reverse(-123));
    }


}