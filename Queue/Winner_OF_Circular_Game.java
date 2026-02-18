//https://leetcode.com/problems/find-the-winner-of-the-circular-game/

class Solution {
public int findTheWinner(int n, int k) {
Queue<Integer> q1=new LinkedList<>();
for(int i=1;i<=n;i++)
{
q1.add(i);
     }
while(q1.size()>1)
{
for(int i=1;i<=k-1;i++)
{
q1.add(q1.remove());
}
q1.remove();

}
return q1.peek();

}
}