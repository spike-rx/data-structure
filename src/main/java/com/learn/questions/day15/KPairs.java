package com.learn.questions.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KPairs {
    public static void main(String[] args) {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};
        int k = 3;
//        kSmallestPairs(nums1, nums2, k);

    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> que = new PriorityQueue<>((a,b)->a.get(0)+a.get(1)-b.get(0)-b.get(1));
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0) return res;
        for(int i=0; i<nums1.length && i<k; i++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(nums1[i]);
            innerList.add(nums2[i]);
            innerList.add(0);
            que.offer(innerList);
        }
        while(k-- > 0 && !que.isEmpty()){
            List<Integer> cur = que.poll();
            res.add(List.of(cur.get(0), cur.get(1)));
            if(cur.get(2) == nums2.length-1) continue;
            // plus nums2 index and put the new pair into the queue

            que.offer(List.of(cur.get(0),cur.get(cur.get(2) + 1), cur.get(2) + 1));
        }
        return res;
    }
}

