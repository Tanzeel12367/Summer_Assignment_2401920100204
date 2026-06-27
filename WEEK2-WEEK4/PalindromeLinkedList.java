class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; fast=fast.next.next;
        }
        ListNode prev=null, cur=slow;
        while(cur!=null){
            ListNode t=cur.next; cur.next=prev; prev=cur; cur=t;
        }
        ListNode l=head, r=prev;
        while(r!=null){
            if(l.val!=r.val) return false;
            l=l.next; r=r.next;
        }
        return true;
    }
}
