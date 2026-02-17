import java.util.*;
class Main {
    public static void sort(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int temp=stack.pop();
        sort(stack);
        insertAtCorrectPosition(stack,temp);
    }
    public static void insertAtCorrectPosition(Stack<Integer> st,int temp)
    {
        if(st.isEmpty()|| st.peek()<temp)
        {
            st.push(temp);
            return;
        }
        int element=st.pop();
        insertAtCorrectPosition(st,temp);
        st.push(element);
    }
    public static void main(String[] args) {
       Stack<Integer> stack=new Stack<>();
       stack.push(8);
       stack.push(1);
       stack.push(-2);
       stack.push(3);
       System.out.print(stack);
       sort(stack);
       System.out.print(stack);
    }
}