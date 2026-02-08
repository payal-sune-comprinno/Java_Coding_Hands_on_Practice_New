//geeksforgeek problem: https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

class Solution {
    public Node reverse(Node head) {
        
        Node temp=null;
        Node current=head;
        while(current!=null)
        {
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            
            
            current=current.prev;
            
            
        }
        if(temp!=null)
        {
            head=temp.prev;
        }
        return head;
    }
}