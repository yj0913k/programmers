package com.rank2;

import java.util.Stack;

public class Q42584 {


    public static void main(String[] args) {

        //prices  1~10,000
        //prices.length 2~100,000
        //떨어지기 전까지는 +다.
        //1은 자기 자신부터 배열이 끝나는 순간까지 세어야함
        //2는 자기 자신 이후부터 1이 나오면 그 순간까지
        //3은 " 1,2가 나오는 순간까지

        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            if(!stack.isEmpty()&&prices[stack.peek()]>prices[i]){
                int k = stack.pop();
                answer[k] = i - k;
            }
            else stack.push(i);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        while (!stack.isEmpty()) {
            int k = stack.pop();
            answer[k] = prices.length - k - 1;//
        }



    }
}
