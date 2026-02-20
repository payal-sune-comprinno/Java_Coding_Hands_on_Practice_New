//reverse the string using stack
import java.util.*;

class Main {
public static void main(String[] args) {
String s="Payal";
Stack<Character> stack=new Stack<>();
for(char ch:s.toCharArray())
{
stack.push(ch);
}
String m="";
while(!stack.isEmpty())
{
m=m+stack.pop();
}
System.out.println(m);
}
}