class Solution {
    public static String reverseString(String s) {
       
        StringBuilder sb=new StringBuilder(s);
        StringBuilder m=sb.reverse();
        String a=m.toString();
        // String a=new String(m);
        return a;
    }
}