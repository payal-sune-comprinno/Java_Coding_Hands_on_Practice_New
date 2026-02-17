//https://leetcode.com/problems/remove-nodes-from-linked-list/


class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            while(stack.size()>0 && stack.peek().val<temp.val)
            {
                stack.pop();
            }
            stack.push(temp);
            temp=temp.next;
        }
        while(stack.size()>0)
        {
            ListNode top=stack.pop();
            top.next=temp;
            temp=top;

        }
        return temp;
    }
}