//Leetcode: https://leetcode.com/problems/odd-even-linked-list/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode t=head;
        int index=1;
        while(t!=null)
        {
            if(index%2==1)
            {
                t1.next=t;
                t1=t1.next;
            }
            else
            {
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
            index++;
        } 
        t2.next=null;
        t1.next=d2.next;
        
        return d1.next;
    }
}