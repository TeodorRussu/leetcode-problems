package solutions.needle_in_stack;

class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        if(needleLength > haystack.length()){
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++){
            if(i + needleLength > haystack.length()){
                return -1;
            }
            if(haystack.substring(i, i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}