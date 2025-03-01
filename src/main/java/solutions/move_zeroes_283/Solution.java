package solutions.move_zeroes_283;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (currentNumber != 0) {
                nums[nonZeroIndex] = currentNumber;
                nums[i] = 0;
                nonZeroIndex++;
            }
        }
    }
}

