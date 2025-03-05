package solutions.max_average_subarray_643;

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double output;
        double sumOfPreviousK = 0;
        for (int i = 0; i < k; i++) {
            sumOfPreviousK += nums[i];
        }

        output = sumOfPreviousK / k;
        for (int i = k; i < nums.length; i++) {
            sumOfPreviousK = sumOfPreviousK - nums[i - k] + nums[i];
            double currentAverage = sumOfPreviousK / k;
            output = currentAverage > output ? currentAverage : output;
        }
        return output;
    }
}