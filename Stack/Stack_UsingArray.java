public class Stack_UsingArray {
    int arr[];
    int size;
    int top;
    Stack_UsingArray(int size)
    {
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top]=data;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
          return -1;
        }
        return  arr[top--];
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        Stack_UsingArray s1=new Stack_UsingArray(4);
        s1.push(8);
        s1.push(5);
        s1.push(10);
        s1.push(4);
        s1.push(45);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
    }
}
