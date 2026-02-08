import java.util.*;
class Main {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void insertnode(int data,int position)
    {
        Node newNode=new Node(data);
        if(position==0)
        {
          newNode.next=head;
          head=newNode;
          return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++)
        {
            if(temp==null)
            {
                System.out.println("Position out of range");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
   void deletenode(int position)
   {
       if(head==null)
       {
           System.out.println("linkedlist is null");
           return;
       }
       if(position==0)
       {
           head=head.next;
           return;
       }
       Node temp=head;
       for(int i=0;i<position-1;i++)
       {
           if(temp.next==null)
           {
               System.out.println("Invalid position");
               return;
           }
           temp=temp.next;
       }
       if(temp.next==null)
       {
           System.out.println("Invalid position or out of range");
           return;
       }
       temp.next=temp.next.next;
   }
   public void insertAtFirst(int data)
   {
       Node newNode=new Node(data);
       if(head==null)
       {
         head=newNode;
         return;
           
       }
       newNode.next=head;
       head=newNode;
   }
   public void insertAtLast(int data)
   {
       Node newNode=new Node(data);
       if(head==null)
       {
           head=newNode;
           return;
       }
       Node current=head;
       while(current.next!=null)
       {
           current=current.next;
       }
       current.next=newNode;
   }
   public void printlist()
   {
       Node current=head;
       while(current!=null)
       {
           System.out.print(current.data+" ");
           current=current.next;
       }
       System.out.println("null");
   }
    public static void main(String[] args) {
        Main m1=new Main();
         Node a = m1.new Node(15);
        Node b = m1.new Node(20);
        Node c = m1.new Node(9);
        Node d = m1.new Node(77);
        m1.head = a;
        a.next = b;
        b.next = c;
        c.next = d;
        m1.deletenode(2); 
        m1.printlist();
        m1.insertnode(78,1);
        m1.printlist();
        m1.insertAtFirst(56);
        m1.printlist();
        m1.insertAtLast(4);
        m1.printlist();
        
    }
}