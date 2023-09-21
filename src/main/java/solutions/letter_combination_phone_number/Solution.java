package solutions.letter_combination_phone_number;

import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty() || digits.isBlank()) {
            return Collections.emptyList();
        }
        Deque<String> currentCombinations = new LinkedList<>();
        var characters = digits.split("");
        for (String character : characters) {
            var mappedCharacters = NumberMapping.mapping.get(character);
            currentCombinations = appendCombinations(currentCombinations, mappedCharacters);
        }

        return new ArrayList<>(currentCombinations);
    }

    private Deque<String> appendCombinations(Deque<String> currentCombinations, List<String> appenableCharacters) {
        Deque<String> queue = new LinkedList<>();

        if (currentCombinations.isEmpty()) {
            return new LinkedList<>(appenableCharacters);
        }

        while (!currentCombinations.isEmpty()) {
            var currentItem = currentCombinations.pop();

            for (String item : appenableCharacters) {
                queue.add(currentItem + item);
            }
        }
        return queue;
    }
}


class NumberMapping {
    private NumberMapping() {
    }

    public static final Map<String, List<String>> mapping = Map.of(
            "2", List.of("a", "b", "c"),
            "3", List.of("d", "e", "f"),
            "4", List.of("g", "h", "i"),
            "5", List.of("j", "k", "l"),
            "6", List.of("m", "n", "o"),
            "7", List.of("p", "q", "r", "s"),
            "8", List.of("t", "u", "v"),
            "9", List.of("w", "x", "y", "z")
    );
}