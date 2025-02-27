package solutions.merge_strings_alternatively_75;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder output = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                output.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                output.append(word2.charAt(j));
                j++;
            }
        }
        return output.toString().trim();
    }
}