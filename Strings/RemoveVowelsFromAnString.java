class Solution {
    String removeVowels(String s) {
   
    StringBuilder m = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                m.append(ch);
            }
        }
        return m.toString();
    }
    
}