package com.rank0;

import java.util.Arrays;

public class Q120880 {

    public static void main(String[] args) {

        int[] numlist = new int[]{1, 2, 3, 4, 5, 6};
        int n = 4;

        Integer[] arr = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = numlist[i];
        }
        Arrays.sort(arr, (x, y) -> {
            int Dx = Math.abs(n - x);
            int Dy = Math.abs(n - y);
            if (Dx == Dy) {
                return y - x;
            }
            return Dx - Dy;
        });

        int[] answer = new int[numlist.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];

        }
        System.out.println(answer);
    }


}
