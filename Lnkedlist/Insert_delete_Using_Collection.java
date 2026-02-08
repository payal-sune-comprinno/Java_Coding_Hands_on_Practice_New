import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        /* ---------- INSERTION ---------- */

        list.add(10);          
        list.add(20);
        list.addFirst(5);      
        list.addLast(30);     
        list.add(2, 15);     
        System.out.println("After insertion: " + list);

        /* ---------- DELETION ---------- */

        list.remove();         
        list.removeFirst();    
        list.removeLast();     
        list.remove(1);        

        System.out.println("After deletion: " + list);
    }
}
