package com.learn.questions.day01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class SmallestInfiniteSet {
    int cur;
    Set<Integer> s;


    public SmallestInfiniteSet() {
        cur = 1;
        s = new HashSet<>();
    }
    public Integer popSmallest() {
        if (!s.isEmpty()) {
            int min = Collections.min(s);
            s.remove(min);
            return min;
        }
        cur ++;
        return cur - 1;

    }

    public void addBack(int num) {
        if (cur > num) {
            s.add(num);
        }
    }
}
