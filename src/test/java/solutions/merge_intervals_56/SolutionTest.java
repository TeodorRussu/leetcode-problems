package solutions.merge_intervals_56;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    Solution solution = new Solution();

    public static List<Arguments> testDataProvider() {
        return List.of(
                Arguments.of(new int[][]{{1, 4}, {2, 6}, {8, 10}}, new int[][]{{1, 6}, {8, 10}}),
                Arguments.of(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}, new int[][]{{1, 10}})
        );
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void merge(int[][] input, int[][] expectedOutput) {

        int[][] actualOutput = solution.merge(input);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertArrayEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}