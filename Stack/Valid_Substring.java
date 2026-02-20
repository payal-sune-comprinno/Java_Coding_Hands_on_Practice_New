//https://www.geeksforgeeks.org/problems/valid-substring0624/1?page=2&category=Java,Stack,Queue,Map&sortBy=submissions
class Solution {
    public int maxLength(String s) {
        // code here
        Stack<Integer> stack=new Stack<>();
        int maxlength=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    maxlength=Math.max(maxlength,i-stack.peek());
                }
            }
            
        }
        return maxlength;
    }
}