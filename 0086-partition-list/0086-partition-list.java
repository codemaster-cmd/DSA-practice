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
    public ListNode partition(ListNode head, int x) {
        ListNode large  = new ListNode(0);
        ListNode small = new ListNode(0);

        ListNode LargeP =  large;
        ListNode SmallP = small;

        while(head != null){
            if(head.val < x){
                SmallP.next = head;
                SmallP =  SmallP.next;
            }else{
                LargeP.next = head;
                LargeP = LargeP.next;
            }
            head = head.next;
        }

        SmallP.next = large.next;
        LargeP.next = null;

        return small.next;
        
    }
}