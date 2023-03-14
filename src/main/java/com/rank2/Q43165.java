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
        if (depth == numbers.length) {
            if (sum == target) {
                return 1;
            } else return 0;
        } else {
            return searchDfs(numbers, target, sum + numbers[depth], depth + 1)
                    + searchDfs(numbers, target, sum - numbers[depth], depth + 1);
        }
    }
}
