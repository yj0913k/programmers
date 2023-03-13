package com.rank2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q138476 {
    public static void main(String[] args) {
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int k = 6;

        int answer = 0;
        int count = 0;

        Arrays.sort(tangerine); //무게 오름차순으로 정렬
        for (int i : tangerine) {
            System.out.print(i);
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();

            for (int i = tangerine.length - 1; i > 1; i--) {
                if(tangerine[i]==tangerine[i-1]) {
                    list.add(tangerine[i]);
                    k-=2;
                    System.out.println(k);
                    if(k==2)break;
                }
            }
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();
        System.out.println(count);


    }
}
