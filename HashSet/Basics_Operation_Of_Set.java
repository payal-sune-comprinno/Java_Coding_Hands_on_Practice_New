import java.util.*;
class Basics_Operation_Of_Set
{
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(7);
        set.add(1);
        set.add(4);
        set.add(9);
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.print(its.next());
        }
        Set<Integer> set2=new HashSet<>();
    set2.add(10);
    set2.add(55);
    System.out.println(set2);



    set.addAll(set2);
    System.out.println(set);
    set.retainAll(set2);
    System.out.println(set);
    set.removeAll(set2);
    System.out.println(set);
    System.out.println(set.equals(set2));
    System.out.println(set.containsAll(set2));

    System.out.println(set);
    Iterator<Integer> itr1=set.iterator();
    while(itr1.hasNext())
    {
    System.out.print(itr1.next()+" ");
    }

    System.out.println();
    set.clear();
        }
    }