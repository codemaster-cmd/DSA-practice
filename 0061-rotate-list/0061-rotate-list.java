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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode tail = head;
        int L = 1;
        while(tail.next != null){
            tail = tail.next;
            L++;
        }

        k = k % L;
        if(k == 0){
            return head;
        }

        // circular connect (tail wil connect head)
        tail.next = head;

        int remain = L - k;
        ListNode newTail = head;
        for(int i=1; i < remain; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;


        return newHead;

    }
}