package com.rank2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12980 {
    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        int answer = 0;
        Arrays.sort(citations);
        int h=0;
        int count =0;
        int j = citations[citations.length-1];
        boolean flag = true;

        while(flag){
            h=0;
            count = 0;
            for(int i: citations){
                if(i>=j)h++;
            }
            for(int k=0; k<= citations.length-1;k++){
                if(citations[k]<h) count++;
            }
            j--;
            if(count==j) {answer = h;flag=false;}
        }
        System.out.println(answer);
    }

}
