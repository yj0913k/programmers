package com.rank2;

public class Q12909 {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                // 첫 글자가 ')'인 경우 false
                if(s.charAt(0)==(')')) answer = false;
                // 마지막 글자가 '('인 경우 false
                if(s.charAt(s.length()-1)==('(')) answer = false;

                int right = 0; // ')' 개수를 세는 변수
                int left = 0; // '(' 개수를 세는 변수
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i)==(')')) right++; // ')'를 만나면 right 변수 값 증가
                    else left++; // '('를 만나면 left 변수 값 증가
                    if(right>left){ // ')' 개수가 '(' 개수보다 많아지면 false
                        answer = false;
                        break;
                    }
                }
                if(right!=left) answer = false; // ')'와 '(' 개수가 다르면 false
                return answer;
            }
        }

    }
}
