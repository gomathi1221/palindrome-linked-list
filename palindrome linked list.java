class Solution {
    
    public boolean isPalindrome(ListNode head) {
       ListNode original=head;
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode reversehalf=reverse(slow);
       ListNode curr1=original;
       ListNode curr2=reversehalf;
       while(curr1!=null&&curr2!=null){
        if(curr1.val!=curr2.val){
            return false;
        }
        curr1=curr1.next;
        curr2=curr2.next;
       }
       return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextnode=null;
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
}