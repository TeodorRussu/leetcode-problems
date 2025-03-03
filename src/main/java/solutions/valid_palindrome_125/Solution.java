package solutions.valid_palindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if(s==null){
            return false;
        }
        if(s.isEmpty()){
            return true;
        }
        int headToTailIndex = 0;
        int tailToHeadIndex = s.length()-1;

        while(headToTailIndex <= tailToHeadIndex){
            char headingCharacter = s.charAt(headToTailIndex);
            char tailingCharacter = s.charAt(tailToHeadIndex);

            if(headingCharacter != tailingCharacter){
                return false;
            }
            headToTailIndex++;
            tailToHeadIndex--;

        }
        return true;
    }

    boolean isAlphaNumeric(char c){
        if((c>='0' && c<='9' ) || (c>='A' && c<= 'Z') || (c>='a' && c<='z')){
            return true;
        }
        return false;
    }
}