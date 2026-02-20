//https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q1=new LinkedList<>();
        int n=q.size();
        for(int i=1;i<=n/2;i++)
        {
            q1.add(q.remove());
        }
        while(q1.size()>0)
        {
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
}