package com.util.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemos {
    public static void main(String[] args) {
     //   Map<Integer, String> hashmap = new HashMap<>();
        Map<Integer, String> hashmap = new LinkedHashMap<>();
      //  Map<Integer, String> hashmap = new TreeMap<>();
        hashmap.put(1, "java");
        hashmap.put(10, "Spring");
        hashmap.put(8, "Node");
        hashmap.put(null, "Css");
        hashmap.put(5, "Html");
        hashmap.put(1, "react");
        hashmap.put(100, null);
        hashmap.put(101, null);
        System.out.println(hashmap);

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(102));//null
        System.out.println(hashmap.getOrDefault(102, "Jsp"));
        System.out.println(hashmap.containsKey(1));
        hashmap.values();

        System.out.println();
        Set<Integer> keys = hashmap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + hashmap.getOrDefault(key));
        }
        System.out.println();
        System.out.println("Using entry set");
        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}

