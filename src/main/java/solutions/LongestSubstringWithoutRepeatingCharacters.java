package solutions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * @param s String
     * @return length int
     */
    public int lengthOfLongestSubstring(String s) {
        if (s==null || s.isEmpty()){
            throw new IllegalArgumentException();
        }
        int longestSubstringLength = 0;
        Map<Character, Integer> visited = new HashMap<>();
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char current = s.charAt(end);
            Integer visitedIndex = visited.get(current);
            if (visitedIndex!=null && visitedIndex >= start) {
                int currentLen = end - start;
                if (currentLen > longestSubstringLength) {
                    longestSubstringLength = currentLen;
                }
                start = visited.get(current) + 1;
            }
            visited.put(current, end++);
        }
        int currentMax = end - start;
        if (currentMax > longestSubstringLength) {
            return currentMax;
        }
        return longestSubstringLength;
    }
}