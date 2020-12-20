//83
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
    public ListNode deleteDuplicates(ListNode head) {


        Set<Integer> ints = new HashSet<>();

        if(head == null) return head;

        ListNode n = head;
        ListNode m = head;
        while(n != null){

            int k = n.val;
            if(ints.contains(k)){

                m.next = n.next;
                n = n.next;
            }else{
                ints.add(n.val);
                m = n;
                n = n.next;
            }

        }

        return head;
    }
}
