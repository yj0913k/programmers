package com.rank2;

import java.util.Arrays;

public class Q42885 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] people, int limit) {
                int answer = 0; // 보트의 최소 운행 횟수를 저장하는 변수
                Arrays.sort(people); // 사람들의 몸무게를 오름차순으로 정렬한다.
                int front = 0; // 앞쪽 사람의 인덱스를 가리키는 포인터 변수
                for(int i=people.length-1; i>=front;i--){ // 뒤쪽 사람부터 보트에 태워서 데려오는 것이 최소 운행 횟수를 만족하는 조건이므로 역순으로 반복한다.
                    if(people[i]+people[front]<=limit){ // 뒤쪽 사람과 앞쪽 사람의 몸무게를 합쳤을 때, 보트의 무게 제한을 넘지 않으면 둘 다 보트에 태워서 데려올 수 있다.
                        answer++; // 보트의 운행 횟수를 증가시킨다.
                        front++; // 앞쪽 사람을 다음 사람으로 이동시킨다.
                    }else answer++; // 뒤쪽 사람만 보트에 태워서 데려올 수 있다면, 뒤쪽 사람만 보트에 태워서 데려온다.
                }
                return answer; // 최소 운행 횟수를 반환한다.
            }
        }

    }
}
