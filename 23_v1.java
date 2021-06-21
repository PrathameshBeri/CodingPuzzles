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
    public ListNode mergeKLists(ListNode[] l1) {
        
    if(l1.length == 0) return null;
        if(l1.length == 1) return l1[0];
     return merge(0, l1.length-1,l1);
        
    }
    
    public ListNode merge(int l1,int h2, ListNode[] l){
        
        if(l1 == h2){
            return (l[l1]);
        }else if( l1 > h2){
            return null;
        }else{
            int mid = (h2 + l1)/2;
            System.out.println(l1 + " " + mid);
            ListNode n = merge(l1, mid, l);
            
            ListNode m = merge(mid+1,h2,l);
            return mergeTwoLists(n,m);
        }
    }
    
        
    
      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null ) return null;
        
        if(l1 == null ) return l2;
        
        if(l2 == null) return l1;
        ListNode ref =  null;
        
        while(l1 != null && l2 != null){
            
            if(l1.val == l2.val){
                // ListNode v1 = l1.next;
                // ListNode v2 = l2.next;
                // l1.next = l2;
                // l2.next = v1;
                // l1 = l2;
                // l2 = v2;
                if(ref == null){
                    ref = l2;
                }
                ListNode v1 = findNext(l2,l1.val);
                l2 = v1.next;
                v1.next = l1;
            }else if(l1.val > l2.val){
                 if(ref == null){
                    ref = l2;
                }
                ListNode v1 = findNext(l2, l1.val);
                l2 = v1.next;
                v1.next = l1;
                
            }else{
                 if(ref == null){
                    ref = l1;
                }
                ListNode v1 =  findNext(l1, l2.val);
                l1 = v1.next;
                v1.next = l2;

            }
          
    }
        
        return ref;
        
    }
    
        ListNode findNext(ListNode l1, int val){
            
            while(l1 != null){
                
                if(l1.next != null && l1.next.val > val){
                    return l1;
                }else if(l1.next != null){
                    l1 = l1.next;
                }
                else{
                    return l1;
                }
            }
            
            return l1;
            
        }
    
    
}