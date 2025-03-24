package solutions.tribonacci_number;

class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n < 3){
            return 1;
        }
        int nCurrentIndexMinusOne = 1;
        int nCurrentIndexMinusTwo = 1;
        int nCurrentIndexMinusThree = 0;

        int nCurrentIndex = 0;

        for (int i=3; i<=n ; i++){
            nCurrentIndex = nCurrentIndexMinusOne + nCurrentIndexMinusTwo + nCurrentIndexMinusThree;
            nCurrentIndexMinusThree = nCurrentIndexMinusTwo;
            nCurrentIndexMinusTwo = nCurrentIndexMinusOne;
            nCurrentIndexMinusOne = nCurrentIndex;
        }
        return nCurrentIndex;
    }
}
