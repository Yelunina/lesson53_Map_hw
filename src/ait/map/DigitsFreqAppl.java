package ait.map;

import java.util.*;

public class DigitsFreqAppl {
    static Random random = new Random();

    public static void main(String[] args) {
        /*
        TODO Homework: Generate 1_000_000 random int positive numbers
        and calculate digits frequency
        18374, 9832, 67, 3525
        [1] -> 1
        [2] -> 2
        [3] -> 3
        [4] -> 1
        ...
         */
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            Integer number = random.nextInt(Integer.MAX_VALUE);
            String[] digits = number.toString().split("");
            for (String string : digits) {
//                if (res.containsKey(string)) {
//                    res.put(string, res.get(string) + 1);
//                } else {
//                    res.put(string, 1);
//                }
                res.put(string, res.getOrDefault(string, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(res.entrySet());
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        list.forEach(e -> System.out.println(e));

    }
}