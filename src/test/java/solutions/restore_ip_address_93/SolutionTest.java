package solutions.restore_ip_address_93;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution;
    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void restoreIpAddresses() {
        List<String> ouptut = solution.restoreIpAddresses("25525511135");
        Assertions.assertTrue(ouptut.size() == 2);
        Assertions.assertTrue(ouptut.containsAll(List.of("255.255.11.135", "255.255.111.35")));

        ouptut = solution.restoreIpAddresses("010010");
        Assertions.assertTrue(ouptut.size() == 2);
        Assertions.assertTrue(ouptut.containsAll(List.of("0.10.0.10","0.100.1.0")));

        ouptut = solution.restoreIpAddresses("010010000020202020303048");
        Assertions.assertTrue(ouptut.size() == 0);
    }
}