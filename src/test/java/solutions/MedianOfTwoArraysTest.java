package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoArraysTest {

    private MedianOfTwoArrays solution;

    @BeforeEach
    void setUp() {
        solution = new MedianOfTwoArrays();
    }

    @Test
    /**
     * nums1 = [1, 3]
     * nums2 = [2]
     */
    void testOne() {
        Assertions.assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    /**
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     */
    void testTwo() {
        Assertions.assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    /**
     * arr1 = [1,2,3,4,10]
     * arr2 = [5,6,7,8,9]
     */
    void testThree() {
        Assertions.assertEquals(5.5, solution.findMedianSortedArrays(new int[]{1, 2, 3, 4, 10}, new int[]{5, 6, 7, 8, 9}));
    }
}