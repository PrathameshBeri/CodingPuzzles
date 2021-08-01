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
    public int numComponents(ListNode head, int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        boolean streak = false;
        ListNode n = head;
        int cc = 0;
        while(n != null){
            
            int curVal = n.val;
            if(hs.contains(curVal) && !streak){
                streak = true;
                cc++;
                n = n.next;
                continue;
            }
            
            if(hs.contains(curVal) && streak){
                n = n.next;
                continue;
            }
            
            if(!hs.contains(curVal)){
                streak = false;
                n = n.next;
                continue;
            }
            
        }
        
        return cc;
    }
}