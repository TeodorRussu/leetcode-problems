package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    @DisplayName("{0, 0, 0}")
    public void test() {
        int[] input = new int[]{0, 0, 0};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(1, response);
    }

    @Test
    @DisplayName("[0,0,1,1,1,2,2,3,3,4]")
    public void test1() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(5, response);
    }

    @Test
    @DisplayName("[1,2]")
    public void test2() {
        int[] input = new int[]{1, 2};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(2, response);
    }

    @Test
    @DisplayName("[1,2,2]")
    public void test3() {
        int[] input = new int[]{1, 2, 2};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(2, response);
    }

    @Test
    @DisplayName("[1,1,2]")
    public void test3_1() {
        int[] input = new int[]{1, 1, 2};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(2, response);
    }

    @Test
    @DisplayName("[-1,0,0,0,0,3,3]")
    public void test4() {
        int[] input = new int[]{-1, 0, 0, 0, 0, 3, 3};
        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(3, response);
    }

    @Test
    @DisplayName("crazy")
    public void test5() {
        List<Integer> list = new ArrayList<>();
        for (int i = -100; i < 101; i++) {
            for (int j = 0; j < 120; j++) {
                list.add(i);
            }
        }
        int[] input = list.stream().mapToInt(i -> i).toArray();

        int response = removeDuplicates.removeDuplicates(input);
        Assertions.assertEquals(201, response);
    }


}