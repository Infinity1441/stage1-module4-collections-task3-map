package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> s : sourceMap.entrySet()) {
            map.put(s.getValue(), s.getKey());
        }
        return map;
    }
}
