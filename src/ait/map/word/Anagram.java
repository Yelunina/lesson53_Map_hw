package ait.map.word;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String word, String part) {
        // TODO Homework
        if (part == null || part.isEmpty() || part.length() > word.length()) {
            return false;
        }
        word = word.toLowerCase();
        part = part.toLowerCase();
        Map<Character, Integer> lettersOfWord = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            lettersOfWord.merge(word.charAt(i), 1, (a, b) -> a + b);
        }

        for (int i = 0; i < part.length(); i++) {
            lettersOfWord.merge(part.charAt(i), 1, (a, b) -> a - b);
        }
        for (int i = 0; i < part.length(); i++) {
            if (lettersOfWord.get(part.charAt(i)) > lettersOfWord.getOrDefault(word.charAt(i), 0)) {
                return false;
            }
        }

        return true;
    }
}