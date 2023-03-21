package com.rank2;

import java.util.*;

public class Q42578 {
    public static void main(String[] args) {
        String[][] clothes = 	{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        HashMap<String, Integer> hash= new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if(hash.containsKey(clothes[i][1])) hash.put(clothes[i][1], hash.get(clothes[i][1]) + 1);
            else hash.put(clothes[i][1], 1);
        }

        int answer = 1;
        for (Integer i : hash.values()) {
            answer*=i;
        }
        System.out.println(answer);

    }
}
