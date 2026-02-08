// Geeksforgeeks question:-
// Given two strings s1 and s2 which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string and return it. 
// Examples:
// Input: s1 = abcd, s2 = badce
// Output: e
// Input: s1 = efg, s2 = gtfe
// Output: t

class Solution {
    public static char extraChar(String s1, String s2) {

        int res=0;
        for(int i=0;i<s1.length();i++)
        {
            res=res^s1.charAt(i);
        }
        for(int j=0;j<s2.length();j++){
            res=res^s2.charAt(j);
        }
        return (char)res;
        
    }
}
