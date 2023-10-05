package solutions.numbers_division;


class Solution {
    public int divide(int dividendOriginal, int divisorOriginal) {

        if (dividendOriginal == divisorOriginal) {
            return 1;
        }

        if (divisorOriginal == Integer.MIN_VALUE) {
            return 0;
        }
        long dividend = dividendOriginal;
        long divisor = divisorOriginal;

        boolean isResultNegative = (dividend < 0) ^ (divisor < 0);
        var resultSignChanger = isResultNegative ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividendOriginal == Integer.MIN_VALUE && divisorOriginal < 0) {
            dividend--; // -2 power 31 absolute value is 2 power 31 − 1, according to the problem constraints
        }

        if (divisor == 1) {
            return (int) (dividend * resultSignChanger);
        }

        var result = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            result++;
        }

        return result * resultSignChanger;
    }
}