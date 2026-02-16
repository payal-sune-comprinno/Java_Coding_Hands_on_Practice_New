//gfg problem:https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1

import java.util.*;
class Balanced_Paranthesis {
    public static boolean isBalanced(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' ||ch=='[' ||ch=='{')
            {
                stack.push(ch);
            }
            else if(ch==')'|| ch=='}'|| ch==']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top!='(')||(ch=='}' && top!='{')||(ch==']' && top!='['))
                {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
       String s="{[(})]}";
       if(isBalanced(s))
       {
           System.out.println("Balanced");
       }
       else
       {
           System.out.println("UNBalanced");
       }

    }
}