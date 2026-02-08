class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String p=Arrays.toString(ch1);
        String q=Arrays.toString(ch2);
        if(p.equals(q))
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }
}