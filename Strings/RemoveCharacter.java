import java.util.*;
class Solution {
    static String removeChars(String str1, String str2) {
      Set<Character> set=new LinkedHashSet<>();
      for(char ch:str2.toCharArray())
      {
          set.add(ch);
      }
      StringBuilder result=new StringBuilder();
     for(int i=0;i<str1.length();i++)
     {
         if(!set.contains(str1.charAt(i)))
         {
             result.append(str1.charAt(i));
         }
     }
     return result.toString();
      
        
    }
}