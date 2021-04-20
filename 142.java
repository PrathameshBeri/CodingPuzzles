//142
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
    public ListNode detectCycle(ListNode head) {

        Set<ListNode> nodes = new HashSet<>();
        ListNode node = head;
        if(node == null) return null;
        while(node.next != null){


            if(nodes.contains(node)) return node;
            else nodes.add(node);
            node = node.next;
        }
        return null;
    }
}
