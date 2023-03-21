package com.rank2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Q12953 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        Arrays.sort(arr);
        int answer = arr[arr.length-1];

        for (int i = arr.length-2; i >=0; i--) {
            answer = (int) LCM(answer, arr[i]);
        }
    }

    public static int LCM(int a, int b) {
        
        int c = GCD(a, b);
        return a * b / c;
    }
    public static int GCD(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }return a;
    }
        
        
}
