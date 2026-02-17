//https://leetcode.com/problems/next-greater-element-ii/



class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            while(stack.size()>0 && stack.peek()<=nums[i])
            {
                stack.pop();
            }
            if(stack.size()>0)
            {
                ans[i]=stack.peek();
            }
            else
            {
                ans[i]=-1;
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}