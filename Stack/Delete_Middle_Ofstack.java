
//https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1?page=1&category=Java,Stack,Queue,Map&difficulty=Easy&sortBy=submissions

class Solution {

    public void deleteMid(Stack<Integer> s) {
        
          int n = s.size();
        
        if (n == 0)
            return;
        
        int k = n / 2;   
        solve(s, k);
    }

public void solve(Stack<Integer> s, int k) {
        
        if (k == 0) {
            s.pop();  
            return;
        }
        
        int temp = s.pop();   
        solve(s, k - 1);      
        
        s.push(temp);        
    }
    
    
    
}