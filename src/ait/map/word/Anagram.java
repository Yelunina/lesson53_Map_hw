package ait.map.word;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String word, String part) {
        // TODO Homework
//        if (part == null || part.isEmpty() || part.length() > word.length()) {
//            return false;
//        }
//        word = word.toLowerCase();
//        part = part.toLowerCase();
//        Map<Character, Integer> lettersOfWord = new HashMap<>();
//        for (int i = 0; i < word.length(); i++) {
//            lettersOfWord.merge(word.charAt(i), 1, (a, b) -> a + b);
//        }
//        Map<Character, Integer> lettersOfPart = new HashMap<>();
//        for (int i = 0; i < part.length(); i++) {
//            lettersOfPart.merge(part.charAt(i), 1, (a, b) -> a + b);
//        }
//        for (int i = 0; i < part.length(); i++) {
//            if (lettersOfPart.get(part.charAt(i)) > lettersOfWord.getOrDefault(part.charAt(i), 0)) {
//                return false;
//            }
//        }
//        return true;
        if (part == null || part.isEmpty() || part.length() > word.length()) {
            return false;
        }
        word = word.toLowerCase();
        part = part.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : word.toCharArray()) {
            map.merge(letter, 1, (a, b) -> a + b);
        }
        for (char letter : part.toCharArray()) {
            int count = map.getOrDefault(letter, 0);
            if (count == 0) {
                return false;
            }
            map.put(letter, count - 1);
        }
        return true;
    }
}