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

    ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public int pairSum(ListNode head) {

       //find left middle node 
        ListNode middleNode = midNode(head);

        //reverse the left of middle half
        ListNode secondHalf = reverse(middleNode.next);
        
        //add middle node to the second half
        middleNode.next = secondHalf;

        ListNode half1 = head;
        ListNode half2 = secondHalf;

        int max = Integer.MIN_VALUE;

        while(half2 != null){
            int sum = half1.val + half2.val;
            max = Math.max(max, sum);
            half1 = half1.next;
            half2 = half2.next;
        }

        return max;
    }
}