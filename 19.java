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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode turtle = head;
        ListNode rabbit = head;
        
        for(int i = 0; i <n; i++){
            if(rabbit != null){
            rabbit = rabbit.next;
            }
        }
        
        while(rabbit != null && rabbit.next != null){
            rabbit = rabbit.next;
            turtle = turtle.next;
        }
         if(n == 1 && head.next == null){
            return null;
        }
        if(n == 1){
            turtle.next = null;
            return head;
        }
       
        if(turtle == head && rabbit == null){
            head = head.next;
            return head;
        }
        turtle.next = turtle.next.next;
        
        return head;
    }
}