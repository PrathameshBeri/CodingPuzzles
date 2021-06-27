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
int length = 0;
    ListNode st;
    Random r = new Random();
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        st = head;
        
        while(head != null){
            length++;
            head = head.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int l =r.nextInt(length);
        int i = 0;
        ListNode star = st;
        while(i < l){
            star = star.next;
            i++;
        }
        return star.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */