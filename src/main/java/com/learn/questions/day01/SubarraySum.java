package com.learn.questions.day01;

import java.util.*;
import java.util.stream.IntStream;

public class SubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        queue.addAll(IntStream.of(nums).boxed().toList());
        int i = 0;
        int sum = 0;
        while (!queue.isEmpty()) {
            i++;
            Integer cur = queue.poll();
            sum += cur;
            if (sum >= target) {
                return i;
            }

        }

        return 0;

    }
}
