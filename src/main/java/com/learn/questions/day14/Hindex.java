package com.learn.questions.day14;

import java.util.Arrays;

public class Hindex {
    public static void main(String[] args) {
        int[] nums = new int[] {3,0,6,1,5};
//        int[] nums = new int[] {1,3,1};
//        int[] nums = new int[] {100};
        System.out.println(hIndex(nums));

    }

    public static int hIndex(int[] citations) {
        int count = 0;
        Arrays.sort(citations);
        if (citations.length == 1) {
            return 1;
        }
        if (citations.length % 2 == 0) {
            count = (citations.length / 2) +1;
//            count = citations[(citations.length / 2) +1];
        }else {
//            count = citations[(citations.length) / 2];
            count = (citations.length) / 2 + 1;
        }
        return count;
    }
}
