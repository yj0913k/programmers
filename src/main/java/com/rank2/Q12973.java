package com.rank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Q12973 {
    public static void main(String[] args) {
        int answer = 0;
        String s = "baabaa";

        Stack<String> result = new Stack<>();
        int i=0;
        while(i<s.length()) {
            char c = s.charAt(i);
            if (!result.isEmpty() && Objects.equals(result.peek(), String.valueOf(s.charAt(i)))) {
                result.pop();
            } else result.push(String.valueOf(s.charAt(i)));
            i++;
        }
        if (result.isEmpty()) answer = 1;
        System.out.println(answer);
    }
}
