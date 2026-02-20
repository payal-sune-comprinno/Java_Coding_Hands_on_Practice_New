//https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1


class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        char ans=0;
        int count=0;
        int maxFreq = 0;
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(map.containsKey(ch))
           {
              map.put(ch,map.get(ch)+1);
           }
           else
           {
               map.put(ch,1);
           }
            int freq = map.get(ch);
            if (freq > maxFreq || 
               (freq == maxFreq && ch < ans)) {
                maxFreq = freq;
                ans = ch;
            }
       }
       
      return ans;
    }
}