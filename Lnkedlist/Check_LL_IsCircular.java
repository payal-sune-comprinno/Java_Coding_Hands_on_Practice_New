//geeksforgeeks problem:https://www.geeksforgeeks.org/problems/circular-linked-list/1


class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if(head==null)
        {
            return false;
            
        }
        Node current=head.next;
        while(current!=null && current!=head)
        {
            current=current.next;
        }
        return current==head;
    }
}