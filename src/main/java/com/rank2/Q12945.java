package com.rank2;

public class Q12945 {
    class Solution {
        public int solution(int n) {

            int A = 0;
            int B = 1;
            int C = 0;
            for(int i=2; i<=n;i++){
                C = (A+B)%1234567;
                A = B;
                B = C;
            }

            return C;
        }


    }
}
