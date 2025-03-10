package solutions.remove_stars_from_character_2309;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String removeStars(String s) {
        Deque<Character> cleaned = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                cleaned.removeLast();
            } else {
                cleaned.addLast(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char character : cleaned) {
            sb.append(character);
        }

        return sb.toString();
    }
}