package com.rank2;

import java.util.*;

public class Q131128 {
    public static void main(String[] args) {

        String x = "1232100";
        String y = "4253100";
        Map<Character, Integer> Xmap = numCount(x);
        Map<Character, Integer> Ymap = numCount(y);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : Xmap.keySet()) {
            if (Ymap.containsKey(c)) {
                for (int i = 0; i < Math.min(Xmap.get(c), Ymap.get(c)); i++) {
                    sb.append(c);
                    if(c=='0') count++;
                }
            }
        }
        sb.reverse();
        if(sb.length()==0) sb.append(-1);
        else if(sb.length()==count)
        System.out.println(sb.toString());
    }
    private static Map<Character, Integer> numCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        return map;
    }


}






