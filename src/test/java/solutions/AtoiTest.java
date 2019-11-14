package solutions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtoiTest {

    private Atoi solution;
    List<TestData> testData;

    @BeforeEach
    void setUp() {
        solution = new Atoi();
        testData = new ArrayList<>();
        testData.add(new TestData("9223372036854775808", 2147483647));
        testData.add(new TestData("-91283472332", -2147483648));
        testData.add(new TestData("words and 987", 0));
        testData.add(new TestData("4193 with words", 4193));
        testData.add(new TestData("-42", -42));
        testData.add(new TestData("42", 42));
        testData.add(new TestData("+23", 23));
        testData.add(new TestData("   -91283472332", -2147483648));
        testData.add(new TestData("9 87", 9));
        testData.add(new TestData("w 4193 with words", 0));
        testData.add(new TestData(null, 0));
    }

    @TestFactory
    public Stream<DynamicTest> translateDynamicTestsFromIterator() {
        return testData.stream()
                .map(data -> DynamicTest.dynamicTest(String.format(" Input: \"%s\"; expected: %d", data.getInput(), data.getExpected()), () -> {
                            assertEquals(data.getExpected(), solution.myAtoi(data.getInput()));
                        }
                ));
    }
}

@Data
@AllArgsConstructor
class TestData {
    private String input;
    private int expected;
}