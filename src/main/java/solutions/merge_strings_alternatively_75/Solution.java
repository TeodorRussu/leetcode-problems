package solutions.merge_strings_alternatively_75;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder output = new StringBuilder();
        boolean w1Finished = false;
        boolean w2Finished = false;

        for (int i = 0; i < 100; i++) {
            char word1CurrentCharacter;
            char word2CurrentCharacter;

            if (!w1Finished) {
                try {
                    word1CurrentCharacter = word1.charAt(i);
                    output.append(word1CurrentCharacter);
                } catch (StringIndexOutOfBoundsException e) {
                    w1Finished = true;
                }
            }
            if (!w2Finished) {
                try {
                    word2CurrentCharacter = word2.charAt(i);
                    output.append(word2CurrentCharacter);
                } catch (StringIndexOutOfBoundsException e) {
                    w2Finished = true;
                }
            }
            if (w1Finished && w2Finished) break;
        }
        return output.toString().trim();
    }
}