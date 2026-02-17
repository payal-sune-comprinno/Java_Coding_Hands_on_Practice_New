//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        int arr1[]=new int[n];
        arr1[n-1]=-1;
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(stack.size()>0 && arr[i]>=stack.peek())
            {
                stack.pop();
            }
            if(stack.size()==0)
            {
                arr1[i]=-1;
            }
            else
            {
                arr1[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(arr1[i]);
        }
        return ans;
    }
}