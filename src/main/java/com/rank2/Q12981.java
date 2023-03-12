package com.rank2;

import java.util.ArrayList;
import java.util.List;

public class Q12981 {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int n = 3;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize",
                "encourage", "ensure", "establish", "hang", "gather", "refer",
                "reference", "estimate", "executive"};
        List<String> list = new ArrayList<>();
        list.add(words[0]);//첫번째는 넣어주기
        int count = 0; //몇번째에 실패하나 반환.
        for (int i = 1; i < words.length; i++) {
            if (!list.contains(words[i]) && words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
                list.add(words[i]);
            } else count = i + 1;
        }
        answer[0] = (count % n == 0) ? n : count % n;
        answer[1] = (count%n>0)? count/n+1 :count/ n;
        if(count==0){answer[0] = 0;answer[1] = 0;
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
