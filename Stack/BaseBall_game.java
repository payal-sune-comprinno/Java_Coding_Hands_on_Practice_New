//leetcode: https://leetcode.com/problems/baseball-game/submissions/1921752179/



class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            if(s.equals("C"))
            {
                stack.pop();
            }
             else if(s.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else  if(s.equals("+"))
            {
                int top=stack.pop();
                int secondtop=stack.peek();
                int sum=top+secondtop;
                stack.push(top);
                stack.push(sum);
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(stack.size()>0)
        {
            sum=sum+stack.pop();
        }
        return sum;
    }
}
