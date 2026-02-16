class InsertAndReverse {
    public static void insertAtBottom(Stack<Integer> stack,int value)
    {
        if(stack.isEmpty())
        {
            stack.push(value);
            return;
        }
        int top=stack.pop();
        insertAtBottom(stack,value);
        stack.push(top);
    }
    public static void reverse(Stack<Integer> stack)
    {
        if(stack.size()<=1)
        {
            return;
        }
        int top=stack.pop();
        reverse(stack);
        insertAtBottom(stack,top);
    }
    public static void main(String[] args) {
       Stack<Integer> stack1=new Stack<>();
       Stack<Integer> stack2=new Stack<>();
        Stack<Integer> stack3=new Stack<>();
       stack1.push(10);
       stack1.push(20);
       stack1.push(30);
       stack1.push(40);
       stack1.push(50);
     insertAtBottom(stack1,60);
     System.out.println(stack1);
     reverse(stack1);
     System.out.println(stack1);

    }
}