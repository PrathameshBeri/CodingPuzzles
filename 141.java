//141.java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null ) return false;

        ListNode b = head;
        ListNode t = head;

        boolean cycle = false;

        while(t != null && b != null){

            if(t.next != null){
                t = t.next;

            }else{

                break;
            }
            if(b.next != null){
                b = b.next.next;
            }else{

                break;
            }

            if(b == t){
                cycle = true;
                break;
            }

        }


        return cycle;


    }
}
