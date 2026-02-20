
//https://www.geeksforgeeks.org/problems/count-the-reversals0401/1?page=2&category=Stack,Queue&sortBy=submissions

class Solution {
    public int countMinReversals(String s) {
        // code here
        int n=s.length();
        if(n%2!=0)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='{')
            {
                stack.push(ch);
            }
            else {
                if(!stack.isEmpty() && stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }
        int open=0;
        int m=stack.size();
        while(!stack.isEmpty())
        {
            if(stack.pop()=='{')
            {
                open++;
            }
            
        }
        int close=m-open;
        return (int)(Math.ceil(open/2.0)+Math.ceil(close/2.0));
    }
}