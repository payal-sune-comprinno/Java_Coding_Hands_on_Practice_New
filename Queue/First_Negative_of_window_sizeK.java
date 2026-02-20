
//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                q.add(i);
            }
        }
        for(int i=0;i<n-k+1;i++)
        {
            while(q.size()>0 && q.peek()<i)
            {
                q.remove();
            }
            if(q.size() > 0 && q.peek() <= i + k - 1)
            {
                ans.add(arr[q.peek()]);
            }
            else
            {
                ans.add(0);
            }
        }
        return ans;
    }
}