package com.rank2;

import java.util.LinkedList;
import java.util.Queue;

public class Q42587 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        location+=1;
        int answer = 0;
        //가장 높은 수 부터 먼저 출력
        Queue<Integer> q = new LinkedList<>();

        for (int priority : priorities) {
            q.add(priority);
        }
        while (!q.isEmpty()) {
            // 큐에서 가장 앞에 있는 문서를 꺼냄
            int selected = q.poll();

            // 큐 안에 선택된 문서보다 높은 우선순위의 문서가 있는지 확인
            boolean hasmaximum = true; // false: 선택된 문서보다 우선순위가 높은 문서가 있음, true: 선택된 문서가 가장 높은 우선순위를 가짐
            for (Integer integer : q) {
                if (integer > selected) {
                    hasmaximum = false;
                    break;
                }
            }

            // 선택된 문서의 우선순위가 가장 높으면 인쇄하고 인쇄 횟수(answer)를 1 증가시킴
            // 선택된 문서의 우선순위가 가장 높지 않으면 큐의 맨 뒤에 다시 넣음
            if (!hasmaximum) {
                q.add(selected);
            } else {
                answer++;
                // 선택된 문서가 내가 요청한 문서이면 반복문을 종료하고 인쇄 횟수(answer)를 출력
                if (location == 1) {
                    break;
                }
            }

            // 내가 요청한 문서의 위치(location)를 조정
            location--;
            if (location < 1) {
                location = q.size();
            }
        }
        System.out.println(answer);
    }
}
