package com.rank2;

import java.util.Arrays;

public class Q12982 {
    public static void main(String[] args) {

        int[] d = {1, 3, 2, 5, 4};
        int answer = 0;
        int budget = 9;

        int sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            sum += d[i];
            if (sum > budget) break;
            answer++;
        }
        System.out.println(answer);
    }
}
