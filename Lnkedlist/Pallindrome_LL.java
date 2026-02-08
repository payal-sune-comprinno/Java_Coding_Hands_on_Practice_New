//Leetcode problem :https://leetcode.com/problems/palindrome-linked-list/

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null)
//         {
//             arr.add(temp.val);
//             temp=temp.next;

//         }         
//         int i=0;
//         int j=arr.size()-1;
//         while(i<=j)
//         {
//             int a=arr.get(i);
//             int b=arr.get(j);
//             if(a!=b)
//             {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

// another approach
class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next!=null && fast.next.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode head2=slow.next;
       slow.next=null;
       head2=reverse(head2);
       ListNode i=head;
       ListNode j=head2;
       while(j!=null)
       {
        if(i.val!=j.val)
        {
            return false;
        }
        i=i.next;
        j=j.next;
       }
       return true;
    }
}