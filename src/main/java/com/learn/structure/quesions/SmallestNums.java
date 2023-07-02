package com.learn.structure.quesions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
*   Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
* */
public class SmallestNums {

    /*
    * {1,2,6},
    * {3,4,5},
    * 1,3
    * 2,3
    * 6,3
    * 4,1
    * 5,1
    *
    *
    * */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> queue = new PriorityQueue<>((a,b) -> a.get(0) + a.get(1) - b.get(0) - b.get(1));
        List<List<Integer>> result = new ArrayList<>();
        for (int i: nums1) {
            queue.add(new ArrayList<Integer>(){
                {
                    add(i);
                    add(nums2[0]);
                    add(1);
                }

            });
        }
        while (k-- > 0 && !queue.isEmpty()) {
            List<Integer> cur = queue.poll();
            result.add(new ArrayList<Integer>(){
                {
                    add(cur.get(0));
                    add(cur.get(1));
                }
            });
            if (cur.get(2) == nums2.length) continue;
            queue.add(new ArrayList<>() {
                {
                    add(nums1[0]);
                    add(nums2[cur.get(2)]);
                    add(cur.get(2) + 1);
                }
            });
        }
        return result;
    }

}
