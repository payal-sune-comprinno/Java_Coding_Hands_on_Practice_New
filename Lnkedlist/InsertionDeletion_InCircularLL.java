
class Main {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void insertAthead(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    public void insertAtposition(int data,int pos)
    {
        Node newNode=new Node(data);
        
        if(pos==1)
        {
            insertAthead(data);
            return;
        }
        int count=1;
        Node temp=head;
        while(count<pos-1&& temp.next!=head)
        {
            temp=temp.next;
            count++;
        }
        if(count!=pos-1)
        {
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void insertAtTail(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        
    }
    public void deleteAtHead()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
            
        }
        temp.next=head.next;
        head=head.next;
    }
    public void deleteAtTail()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==head)
        {
            head=null;
            return;
        }
        Node prev=null;
        Node temp=head;
        while(temp.next!=head)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=head;
    }
    public void deleteAtPosition(int pos)
    {
        if(pos==1)
        {
            deleteAtHead();
            return;
        }
        Node temp=head;
        int count=1;
        while(count<pos-1 && temp.next!=head)
        {
            temp=temp.next;
            count++;
        }
        if(temp.next==head)
        {
            System.out.println("INvalid");
            return;
        }
        temp.next=temp.next.next;
    }
    public void display()
    {
        Node temp=head;
        if(head==null)
        {
            return;
        }
        System.out.print(temp.data+"->");
        temp=temp.next;
        while(temp!=head)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
         System.out.println(temp.data);
       
    }
    public static void main(String[] args) {
        Main m1=new Main();
        m1.insertAthead(7);
        m1.insertAthead(9);
        m1.insertAthead(8);
        m1.display();
        m1.insertAtposition(55,2);
        m1.display();
        m1.insertAtTail(11);
        m1.display();
        m1.deleteAtHead();
        m1.display();
        m1.deleteAtTail();
        m1.display();
        m1.deleteAtPosition(2);
        m1.display();
    }
}
