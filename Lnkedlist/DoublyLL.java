class DoublyLL
{
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void insertNodeBeg(int data)
    {
        Node newNode=new Node(data);
        if(head!=null)
        {
            newNode.next=head;
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertNodeEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void displayForward()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward()
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"<=>");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
       DoublyLL m1=new DoublyLL();
       m1.insertNodeBeg(6);
       m1.insertNodeEnd(9);
       m1.insertNodeBeg(3);
       m1.displayForward();
       m1.displayBackward();
       
    }
}