package com.rank2;

import java.util.Arrays;

public class Q87946 {
    public static void main(String[] args) {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int k = 80;
        int fatigue = 0;
        int answer = 0;
        Arrays.sort(dungeons, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        for (int i = 0; i < dungeons.length; i++) {
            int minimumF = dungeons[i][0];
            int spentF = dungeons[i][1];
            if (minimumF <= k &&  k - spentF>=0) {
                answer++;
                k -= spentF;
            } else if (i == dungeons.length - 1 && minimumF > k) {
                answer = 0;
            }

        }
        System.out.println(answer);
    }
}


