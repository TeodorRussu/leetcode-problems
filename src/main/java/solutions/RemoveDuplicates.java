package solutions;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueItems = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                break;
            }
            if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                nums[uniqueItems++] = nums[i];
            }
        }
        return uniqueItems;
    }

    public int removeDuplicates1(int[] nums) {
        int numberOfMovesToTheEnd = 0;
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;

            if (i == nums.length - 2 && nums[i] < nums[j]) {
                break;
            }
            if (nums[i] > nums[j]) {
                break;
            }
            if (nums[i] == nums[j]) {
                moveDuplicateToTheEnd(nums, j);
                numberOfMovesToTheEnd++;
                if (numberOfMovesToTheEnd == nums.length) {
                    break;
                }
                i--;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                return i + 1;
            }
        }
        return nums.length;
    }

    public void moveDuplicateToTheEnd(int nums[], int duplicatePosition) {
        for (int i = duplicatePosition; i < nums.length - 1; i++) {
            swapWithoutThirdVariable(nums, i, i + 1);
        }
    }

    public void swapWithoutThirdVariable(int nums[], int pos1, int pos2) {
        nums[pos1] = nums[pos1] + nums[pos2];
        nums[pos2] = nums[pos1] - nums[pos2];
        nums[pos1] = nums[pos1] - nums[pos2];
    }

    public void classicSwap(int nums[], int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

}
