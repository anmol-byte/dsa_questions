// LC question from top interview questions

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 Adding Chnages 4
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0 ;
        ListNode root = new ListNode() ;
        ListNode prev = root ;
        while(l1!=null && l2!=null ){
            if(l1.val+l2.val+carry <10){
                l1.val = l1.val + l2.val + carry ;
                carry = 0 ;
                prev.next = l1 ;
                prev = prev.next ;
                l1 = l1.next ;
                l2 = l2.next ;
            }
            else {
                int te = (l1.val + l2.val + carry) ;
                l1.val = te%10 ;
                carry = te/10 ;
                prev.next = l1 ;
                prev = prev.next ;
                l1 = l1.next ;
                l2 = l2.next ;                
            }
        }
        if(l1==null && l2==null ){
            if(carry!=0){
                prev.next = new ListNode(carry) ;
                carry = 0 ;
            }
            return root.next ;
        }
        else if(l1==null && l2!=null ){
            while( l2!=null ){
                if(l2.val+carry <10){
                    l2.val = l2.val + carry ;
                    carry = 0 ;
                    prev.next = l2 ;
                    prev = prev.next ;
                    l2 = l2.next ;
                }
                else {
                    int te = (l2.val + carry) ;
                    l2.val = te%10 ;
                    carry = te/10 ;
                    prev.next = l2 ;
                    prev = prev.next ;
                    l2 = l2.next ;                
                }
            }
            if(carry!=0){
                prev.next = new ListNode(carry) ;
                carry = 0 ;
            }            
            return root.next ;
        }
        else{
            while( l1!=null ){
                if(l1.val+carry <10){
                    l1.val = l1.val + carry ;
                    carry = 0 ;
                    prev.next = l1 ;
                    prev = prev.next ;
                    l1 = l1.next ;
                }
                else {
                    int te = (l1.val + carry) ;
                    l1.val = te%10 ;
                    carry = te/10 ;
                    prev.next = l1 ;
                    prev = prev.next ;
                    l1 = l1.next ;                
                }
            }
            if(carry!=0){
                prev.next = new ListNode(carry) ;
                carry = 0 ;
            }            
            return root.next ;
        }    

    }
}
