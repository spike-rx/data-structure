package com.learn.questions.day03;

import javax.management.StringValueExp;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
//        String numberStr = Integer.toString(x);
//        String[] digits = new String[numberStr.length()];
//
//        for (int i = 0; i < numberStr.length(); i++) {
//            // 从字符串中提取每个数字并将其存储在数组中
//            digits[i] = String.valueOf(numberStr.charAt(i));
//        }
//        Stack<String> stackX = new Stack<>();
//        stackX.addAll(List.of(digits));
//        String result = "";
//        for (int i= 0; i<digits.length; i++) {
//            result += stackX.pop();
//        }
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();
        String name = "";

        return s.toString().equals(String.valueOf(x));
    }
}
