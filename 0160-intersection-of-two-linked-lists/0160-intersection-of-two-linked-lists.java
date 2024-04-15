/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        //1st approach

        // int sizeA = 0;
        // int sizeB = 0;
        // while(tempA != null){
        //     sizeA++;
        //     tempA = tempA.next;
        // }

        // while(tempB != null){
        //     sizeB++;
        //     tempB = tempB.next;
        // }

        // tempA = headA;
        // tempB = headB;
        // int idx = Math.abs(sizeA - sizeB);
        
        // if(sizeA > sizeB){
        //     while(idx > 0){
        //         tempA = tempA.next;
        //         idx--;
        //     }
        // }
        // else{
        //     while(idx > 0){
        //         tempB = tempB.next;
        //         idx--;
        //     }
            
        // }

        // while(tempA != tempB){
        //     tempA = tempA.next;
        //     tempB = tempB.next;
        // }

        // return tempA;

        //2nd approach
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;

            if(tempA == tempB) return tempA;

            if(tempA == null) tempA = headB;

            if(tempB == null) tempB = headA;
        }

        return tempA;
    }
}