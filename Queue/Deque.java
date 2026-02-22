dequeu

import java.util.*;

class Main {
        public static void main(String[] args) {
        Deque<Integer> d1=new LinkedList<>();
        d1.addFirst(8);
        d1.addLast(3);
d1.addFirst(1);
        System.out.println(d1);
         d1.addLast(3);
          d1.addLast(7);
           d1.addLast(2);
            d1.addLast(5);
            System.out.println(d1);
            d1.addFirst(4);
          System.out.println(d1);
          d1.removeLast();
          System.out.println(d1);
          System.out.println(d1.getFirst());
          System.out.println(d1.getLast());
          d1.add(88);//last mai add hota hai
          System.out.println(d1);
          d1.removeFirstOccurrence(3);
          System.out.println(d1);
           d1.removeLastOccurrence(3);
          System.out.println(d1);
          d1.remove();//remove first element
          System.out.println(d1);
          d1.removeAll(d1);
          System.out.println(d1);



    }
}