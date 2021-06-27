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
    public boolean isPalindrome(ListNode head) {
        
        ListNode st = head;
        ListNode t = head;
        boolean isp = true;
        int count = 0;
        Stack<Integer> s = new Stack<>();
        while(t != null){
            count++;
            t = t.next;
        }
        int i = 0;
      while(i < count){
          
          if(i < count/2){
              s.push(st.val);
              st = st.next;
              i++;
          }else if(count %2 != 0 && i == count/2){
              st = st.next;
              i++;
          }
          else{
              int u = s.pop();
              if(u != st.val){
                  isp = false;
                  break;
              }
              st = st.next;
              i++;
          }
          
      }
        
        return isp;
        
    }
}