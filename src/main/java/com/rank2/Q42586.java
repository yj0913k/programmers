package com.rank2;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.Stack;

public class Q42586 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Stack<Integer> answer = new Stack<>(); // 작업 완료까지 남은 일 수를 저장할 스택
        int[] day = new int[100]; // 각 일 수별로 몇 개의 작업이 완료됐는지 저장할 배열
        int[] pro = new int[progresses.length]; // 작업 완료까지 걸리는 일 수를 저장할 배열

        // 각 작업별 작업 완료까지 걸리는 일 수 계산
        for (int i = 0; i < progresses.length; i++) {
            int count =0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                count++;
            }
            pro[i] = count;
        }

        // 작업 완료까지 걸리는 일 수가 더 오래 걸리는 작업으로 일 수 갱신
        for (int i = 0; i < pro.length-1; i++) {
            if(pro[i]>pro[i+1]) pro[i + 1] = pro[i];
        }

        // 각 일 수별로 몇 개의 작업이 완료됐는지 계산
        for (int i : pro) {
            day[i]++;
        }

        // 스택에 각 일 수별로 완료된 작업 수 추가
        for (int i : day) {
            if(i!=0) answer.add(i);
        }
    }
}
