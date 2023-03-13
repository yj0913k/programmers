package com.rank2;

public class Q12939 {
    public static void main(String[] args) {
        class Solution {                            // 클래스 정의
            public String solution(String s) {       // 문자열을 받아 최소값과 최대값 반환하는 메서드
                String answer = "";                  // 반환할 문자열을 저장할 변수 초기화
                String[] list = s.split(" ");        // 공백을 기준으로 문자열 분리하여 배열에 저장
                int[] ans = new int[list.length];    // 문자열을 정수형으로 변환한 값을 저장할 배열 초기화
                int min = Integer.MAX_VALUE;         // 최소값을 저장할 변수 초기화 (최대값과 중복 방지를 위해 최대값보다 큰 값으로 초기화)
                int max = Integer.MIN_VALUE;         // 최대값을 저장할 변수 초기화 (최소값과 중복 방지를 위해 최소값보다 작은 값으로 초기화)
                for(int i=0; i<list.length; i++){    // 문자열 배열을 반복문을 이용해 탐색
                    if(min>Integer.parseInt(list[i])) min = Integer.parseInt(list[i]); // 최소값 갱신
                    if(max<Integer.parseInt(list[i])) max = Integer.parseInt(list[i]); // 최대값 갱신
                }
                return min+" "+max;                  // 최소값과 최대값 반환
            }
        }

    }

}
