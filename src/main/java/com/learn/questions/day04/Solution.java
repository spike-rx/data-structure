package com.learn.questions.day04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(kthFactor(32, 1));
    }
    public static int kthFactor(int n, int k) {
        List<Integer> factorList = new ArrayList<>();
        for (int i=n; i>0; i--) {
            if (n % i ==0) {
                factorList.add(n / i);
            }
        }
        Set<Integer> factorSet = new HashSet<>(factorList);
        List<Integer> sortedList = (List<Integer>) factorSet.stream().sorted().toList();
        int result;
        if (factorSet.size() < k) {
             result = sortedList.size() - k;
        } else {
            result = (int) sortedList.toArray()[k-1];
        }
        return result;
    }
}
