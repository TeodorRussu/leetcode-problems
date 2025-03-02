package solutions.merge_intervals_56;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }



        List<int[]> output = new ArrayList<>();
        for (int[] interval : intervals) {
            boolean updated = false;
            List<int[]> toRemove = new ArrayList<>();
            for (int[] outputInterval : output) {
                if (areIntervalsOverlapping(interval, outputInterval)) {
                    int[] merged = mergeIntervals(interval, outputInterval);
                    interval[0] = merged[0];
                    interval[1] = merged[1];
                    updated = true;
                    toRemove.add(outputInterval);
                }
            }
            if (updated) {
                output.removeAll(toRemove);
                output.add(interval);
            }else {
                output.add(interval);
            }
        }

        int outputIndex = 0;
        int[][] outputArray = new int[output.size()][2];
        for (int[] interval : output) {
            outputArray[outputIndex++] = interval;
        }
        return outputArray;
    }

    boolean areIntervalsOverlapping(int[] a, int[] b) {
        if (a[1] >= b[0] && a[0] <= b[0])
            return true;
        if (b[1] >= a[0] && b[0] <= a[0])
            return true;
        return false;
    }

    int[] mergeIntervals(int[] a, int[] b) {
        int minIndex = a[0] < b[0] ? a[0] : b[0];
        int maxInterval = a[1] > b[1] ? a[1] : b[1];

        return new int[]{minIndex, maxInterval};
    }

}