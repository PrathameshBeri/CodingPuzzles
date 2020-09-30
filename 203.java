//203

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
    public ListNode removeElements(ListNode head, int val) {

    if(head == null){
        return null;
    }

     ListNode current = head;
     ListNode viable;
    while(current != null ){

        while(current != null && current.val == val && head == current){

            current = current.next;
            head = current;
            System.out.println(" the current and head are " + current + " " + head);

        }
        if(current != null && current.val == val){
            viable = head;
            while(viable.next != null && viable.next != current){
                viable = viable.next;
            }
         while(current != null && current.val == val)   {
            current = current.next;
         }
            viable.next = current;
        }

        if(current != null && current.next != null){
            current = current.next;
        }else break;
    }
        return head;
}
}
