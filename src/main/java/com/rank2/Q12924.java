package com.rank2;

public class Q12924 {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            for (int i = 1; i < n / 2 + 1; i++) {
                int sum = 0;
                for (int j = i; j <= n / 2 + 1; j++) {
                    sum += j;
                    if (sum == n) answer++;
                    if (sum > n) break;
                }
            }
            return answer;
        }

    }
}

