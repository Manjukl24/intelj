package com.util.maps;

import java.lang.reflect.Array;
import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Banglore", "Mysore", "Kolar"));
        stateMap.put("Kerala", Arrays.asList("Munner", "waynad", "kannur"));
        stateMap.put("Andra Pradesh", Arrays.asList("Vizag", "kadapa", "kurnool"));
        stateMap.put("Tamil nadu", Arrays.asList("Chennai", "Vellore", "Salem"));
        Set<String> states = stateMap.keySet();
        for (String state : states) {
            System.out.println("State =" + state);
            List<String> cities = stateMap.get(state);
            for (String city : cities) {
                System.out.println("Cities are" + city);
            }
        }
    }
}
