package com.learn.structure.quesions;

/**
 * @author : Spike
 * @date : 2023/2/11
 */
public class SplitLInkedList {
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] result = new ListNode[k];
        ListNode trav = head;
        ListNode temp = head;

        int size = 0;
        while (temp != null) {
            size += 1;
            temp = temp.next;
        }
        int quotient = size / k;
        int remainder = size % k;

        for (int i = 0; i <k && trav != null; i++) {
            result[i] = trav;
            int partSize = quotient + (i < remainder ? 1 : 0);

            for (int j = 1; j < partSize; j++) {
                trav = trav.next;
            }
            ListNode next = trav.next;
            trav.next = null;
            trav = next;

        }
        return result;
    }


}
