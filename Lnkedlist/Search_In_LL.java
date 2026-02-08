//geeksforgeeks: https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1


class Solution {
    public boolean searchKey(Node head, int key) {
     
        Node current=head;
        while(current!=null)
        {
            if(current.data==key)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }
}