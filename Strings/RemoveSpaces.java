import java.util.*;
class Solution {

    String modify(String s) {
        // your code here
        String m="";
        for(int i=0;i<s.length();i++)
        {
        if(Character.isWhitespace(s.charAt(i)))
        {
            continue;
        }
        
        m=m+s.charAt(i);
        }
        return m;
    }
}