package solutions.max_vovels_in_substring;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int maxVowels(String s, int k) {
        if (k == 0) {
            return 0;
        }
        if (s == null) {
            return 0;
        }
        if (k > s.length()) {
            k = s.length();
        }
        List<Character> vovels = List.of('a', 'e', 'i', 'o', 'u');

        int maxVovels = 0;
        int currentStringWindowsVovelsCount = 0;

        Deque<Character> shiftingWindow = new LinkedList();
        for (int i = 0; i < k; i++) {
            shiftingWindow.add(s.charAt(i));
            if (vovels.contains(s.charAt(i))) {
                currentStringWindowsVovelsCount++;
            }
        }
        maxVovels = currentStringWindowsVovelsCount;

        for (int i = k; i < s.length(); i++) {

            char removedCharacter = shiftingWindow.removeFirst();
            if (vovels.contains(removedCharacter)) {
                currentStringWindowsVovelsCount--;
            }
            char characterToAdd = s.charAt(i);
            shiftingWindow.add(characterToAdd);

            if (vovels.contains(characterToAdd)) {
                currentStringWindowsVovelsCount++;
            }

            if (maxVovels < currentStringWindowsVovelsCount) {
                maxVovels = currentStringWindowsVovelsCount;
            }
        }
        return maxVovels;
    }
}