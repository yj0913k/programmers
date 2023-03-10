package com.rank2;

import java.util.function.IntBinaryOperator;

import static java.lang.Integer.toBinaryString;

public class Q12911 {
    public static void main(String[] args) {


        class Solution {
            public int solution(int n) {
                int answer = 0;
                int nBC = Integer.bitCount(n);

                for (int i=n+1; i<10000000; i++){
                    int rBC = Integer.bitCount(i);
                    if(nBC ==rBC) {answer = i;break;}
                }
                return answer;
            }
        }
    }

}
