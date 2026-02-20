class Solution {
public boolean isAnagram(String s1, String s2) {
Map<Character,Integer> map=new HashMap<>();

if(s1.length()!=s2.length())
{
return false;
}
for(char ch:s1.toCharArray())
{
if(map.containsKey(ch))
{
map.put(ch,map.get(ch)+1);
}
else
{
map.put(ch,1);
}

}
for(char ch:s2.toCharArray())
{
if(!map.containsKey(ch)||map.get(ch)==0)
{
return false;
}
map.put(ch,map.get(ch)-1);
}
return true;
}
}
