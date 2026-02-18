//geeksforgeeks: https://www.geeksforgeeks.org/problems/queue-reversal/1

class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
      Stack<Integer> stack=new Stack<>();
      while(!q.isEmpty())
      {
          stack.add(q.remove());
      }
      while(!stack.isEmpty())
      {
          q.add(stack.pop());
      }
       
    }
}