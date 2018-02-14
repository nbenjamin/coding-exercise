package com.nbenja.codingexercise;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class EnqueueDequeue {

    private static Map<Integer, Integer> map = new LinkedHashMap();

    public static void enqueue(Integer input){
        map.put(input, input);
    }

    public static void dequeue(final Integer input) {
        map.entrySet().removeIf(e -> e.getKey().compareTo(input)==0);
    }

    public static boolean isKeyPresent(Integer input) {
        return map.entrySet().stream().anyMatch(e -> e.getKey().compareTo(input)==0);
    }

    public static boolean isValuePresent(Integer input) {
        return map.values().stream().anyMatch(e -> e.compareTo(input)==0);
    }
    public static void main(String[] args) {
        enqueue(1);
        enqueue(3);
        System.out.println(map);
        dequeue(2);
        System.out.println(map);
        System.out.println(isKeyPresent(3));
        System.out.println(isKeyPresent(2));
        System.out.println(isValuePresent(2));
        System.out.println(isValuePresent(3));

    }
}
