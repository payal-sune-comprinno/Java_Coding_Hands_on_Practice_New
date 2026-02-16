//gfg problem:https://www.geeksforgeeks.org/problems/consecutive-elements2306/1

import java.util.*;
class Remove_Consequetive {
    public static void main(String[] args) {
       String s="aaabbccdda";
       if (s == null || s.length() <= 1) return s;
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != ch)     	{
                stack.push(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.reverse().toString();

    }
}