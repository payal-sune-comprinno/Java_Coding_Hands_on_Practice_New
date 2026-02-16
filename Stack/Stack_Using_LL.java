class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class MyStack
{
    Node head;
    int len;
    int peek()
    {
        if(head==null)
        {
            System.out.println("stack underflow");
            return -1;
        }
        return head.val;
    }
    int pop()
    {
        if(head==null)
        {
            System.out.println("stack underflow");
            return -1;
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;

    }
    void push(int element)
    {
        Node newNode=new Node(element);

            newNode.next=head;
            head=newNode;

        len++;
    }
    int size()
    {
        return len;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
}
class Stack_Using_LL {
    public static void main(String[] args) {
        MyStack m1=new MyStack();
        m1.push(8);
        m1.push(6);
        m1.push(9);
        m1.push(5);
        m1.push(2);
        m1.display();
           System.out.println(m1.pop());
        System.out.println(m1.peek());

    }
}