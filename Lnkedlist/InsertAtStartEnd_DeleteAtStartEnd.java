class Linkedlist{
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
        public void addFirst(int data)
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
        public void addLast(int data)
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
        public void deleteFirst()
        {
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            head=head.next;
        }
        public void deleteLast(){
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node secondlast=head;
            Node lastnode=head.next;
            while(lastnode.next!=null){
                lastnode=lastnode.next;
                secondlast=secondlast.next;
            }
            secondlast.next=null;
        }
        public void printlist()
        {
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            Node current=head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }
        public static void main(String args[])
        {
           Linkedlist l1=new Linkedlist(); 
           l1.addFirst(8);
           l1.addFirst(7);
           l1.addFirst(3);
           l1.addLast(1);
           l1.printlist();
           l1.deleteFirst();
           l1.printlist();
           l1.deleteLast();
           l1.printlist();


        }
    
}