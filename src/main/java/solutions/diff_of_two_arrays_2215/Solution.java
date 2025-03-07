package solutions.diff_of_two_arrays_2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> output1 = new ArrayList<>();
        List<Integer> output2 = new ArrayList<>();
        List<List<Integer>> output = List.of(output1, output2);

        Set<Integer> nums1set = arrayToSet(nums1);
        Set<Integer> nums2Set = arrayToSet(nums2);

        for (int num : nums1set) {
            if (!nums2Set.contains(num)) {
                output1.add(num);
            }
        }

        for (int num : nums2Set) {
            if (!nums1set.contains(num)) {
                output2.add(num);
            }
        }

        return output;
    }

    private Set<Integer> arrayToSet(int[] nums) {
        Set<Integer> output = new HashSet<>();
        for (int num : nums) {
            output.add(num);
        }
        return output;
    }
}