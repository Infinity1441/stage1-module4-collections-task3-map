package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        if (sentence.equals("")) {
            return map;
        }
        sentence = sentence.toLowerCase();

        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");

        String[] s = sentence.split(" ");

        int i;
        for (String s1 : s) {
            if (!map.containsKey(s1))
                map.put(s1, 1);
            else {
                i = map.get(s1) + 1;
                map.put(s1, i);
            }
        }
        return map;
    }
}
