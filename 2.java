//2
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        int sum = 0;
        
        ListNode n = new ListNode();
        ListNode f = n;
        boolean hn;
        do{
            hn = false;
            if(l1 != null) {sum += l1.val; l1 = l1.next; }
            if(l2 != null) {sum += l2.val; l2 = l2.next;}
            
            sum += carry;
          
            carry = 0;
            if(sum > 9 ){
                
                sum -= 10;
                carry = 1;
            }
            n.val = sum;
            sum = 0;
            
            if(l1 != null || l2 != null || carry > 0){
                
                n.next = new ListNode();
                n = n.next;
                
            }
            
        }while(l1 != null || l2 != null || carry > 0);
        
        return f;
    }
}