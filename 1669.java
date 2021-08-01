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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode forward = list1;
        ListNode backward = list1;
        
        int diff = b + 2 - a ;
        int count = 0;
        while(count < diff){
            forward = forward.next;
            count++;
        }
        System.out.println(forward.val);
        count = 0;
        
        while(count < a - 1){
            
            forward = forward.next;
            backward = backward.next;
            count++;
        }
        backward.next = list2;
        while(backward.next != null){
            backward = backward.next;
        }
        backward.next = forward;
        return list1;
    }
}