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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        int n = 0;
        while(current != null){
            n++;
            current = current.next;
        }

        int midNodeIndex = n / 2;
        current = head;
        ListNode prev = null;
        int count = 0;

        while (current != null && count < midNodeIndex) {
            prev = current;
            current = current.next;
            count++;
        }

        if(prev != null){
            prev.next = current.next;
        } 
        else{
            head = head.next;
        }

        return head;

    }
}