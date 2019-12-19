package solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class RegExMatchingTest {

    private RegExMatching solution;
    List<RegExTestData> testData;

    @BeforeEach
    void setUp() {
        solution = new RegExMatching();
        testData = new ArrayList<>();
        testData.add(new RegExTestData("xaabyc", "xa*b.c", true));
        testData.add(new RegExTestData("aa", "a*", true));
        testData.add(new RegExTestData("ab", ".*", true));
        testData.add(new RegExTestData("aab", "c*a*b", true));
        testData.add(new RegExTestData("mississippi", "mis*is*p*.", false));

        testData.add(new RegExTestData("aa", "a", false));
        testData.add(new RegExTestData("aa", "a", false));
        testData.add(new RegExTestData("aa", "a", false));
        testData.add(new RegExTestData("aa", "a", false));
        testData.add(new RegExTestData("aa", "a", false));

    }

    @TestFactory
    public Stream<DynamicTest> translateDynamicTestsFromIterator() {
        return testData.stream()
            .map(data -> DynamicTest.dynamicTest(String.format(" Check if input: \"%s\"; matches: %s pattern: ", data.getInput(), data.getPattern()), () -> {
                                                     assertEquals(data.isMatching(), solution.isMatch(data.getInput(), data.getPattern()));
                                                 }
            ));
    }
}


@Data
@AllArgsConstructor
class RegExTestData {
    private String input;
    private String pattern;
    private boolean isMatching;
}