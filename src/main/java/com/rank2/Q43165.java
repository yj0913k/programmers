package com.rank2;

import java.util.Stack;
import java.util.Random;

public class Q43165 {
    static int[] numbers = {1, 1, 1, 1, 1};
    static int target = 3;

    public void main(String[] args) {
        int answer = searchDfs(numbers, target, 0, 0);
        System.out.println(answer);
    }

    public int searchDfs(int[] numbers, int target, int sum, int depth) {
        if (depth == numbers.length) {  // 종료 조건: 배열의 끝까지 도달했을 때
            if (sum == target) {  // 현재까지의 합이 목표하는 수와 같을 때
                return 1;
            } else return 0;
        } else {  // 배열의 끝까지 도달하지 않았을 때
            // 현재 위치에서 + 또는 - 연산을 수행하여 다음 단계로 이동
            return searchDfs(numbers, target, sum + numbers[depth], depth + 1)
                    + searchDfs(numbers, target, sum - numbers[depth], depth + 1);
        }
    }
}
