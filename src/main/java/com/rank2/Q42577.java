package com.rank2;

import java.util.Arrays;
import java.util.HashSet;

public class Q42577 {
    public static void main(String[] args) {

        String[] phone_book = {"12", "123", "1235", "567", "88"};
        String answer = "true";

        HashSet<String> hash = new HashSet<>();

        for (String s : phone_book) {
            for (int i = 0; i < s.length(); i++) {
                hash.add(s.substring(0, i));
            }
        }
        for (String s : phone_book) {
            if (hash.contains(s)) {
                answer = "false";
                break;
            }
        }

        System.out.println(answer);
    }

}

