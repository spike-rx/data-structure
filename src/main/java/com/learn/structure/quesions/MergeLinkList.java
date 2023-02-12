package com.learn.structure.quesions;

/**
 * @author : Spike
 * @date : 2023/2/11
 */

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeLinkList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode prev = result;
        while (list1 != null && list2 != null) {
            if ( list1.val > list2.val){
                prev.next = list2;
                list2 = list2.next;
            }else {
                prev.next = list1;
                list1 = list1.next;
            }
            prev = prev.next;
        }
        if (list1 != null) {
            prev.next = list1;
        }
        if (list2 != null) {
            prev.next = list2;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode list2 = new ListNode(2, list);
        ListNode list3 = new ListNode(3, list2);

        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5, list4);
        ListNode list6 = new ListNode(6, list5);

        System.out.println(mergeTwoLists(list3, list6));

    }

}
