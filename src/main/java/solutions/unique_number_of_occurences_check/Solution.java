package solutions.unique_number_of_occurences_check;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurences = new HashMap<>();
        for(int number : arr){
            occurences
                    .compute(number, (key, val) -> (val == null) ? 1 : val + 1);
        }
        return occurences.values().size() == new HashSet(occurences.values()).size();
    }
}
