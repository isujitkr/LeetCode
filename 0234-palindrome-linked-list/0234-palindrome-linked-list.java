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
    public ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseNode(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode = null;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode middleNode = midNode(head);

        ListNode secondHalf = reverseNode(middleNode.next);
        middleNode.next = secondHalf;
       
        ListNode half1 = head;
        ListNode half2 = secondHalf;

        if(half1.val != half2.val){
            return false;
        }

        while(half2 != null){
            if(half1.val != half2.val) return false;
            half1 = half1.next;
            half2 = half2.next;
        }

        return true;

    }
}