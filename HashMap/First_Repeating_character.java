//first repeating character
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="google";
        HashMap<Character,Integer> map=new HashMap<>();
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
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
        
    }
}