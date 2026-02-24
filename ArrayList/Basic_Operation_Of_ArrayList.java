import java.util.*;
class Main{
public static void main(String[] args){
ArrayList<Integer>a1=new ArrayList<>();
a1.add(19);
a1.add(3);
a1.add(6);
a1.add(1);
System.out.println(a1);
a1.add(3);
System.out.println(a1);
a1.add(2,88);
System.out.println(a1);
System.out.println(a1.get(1));
a1.set(2,55);
System.out.println(a1);
a1.remove(2);
System.out.println(a1);
System.out.println(a1.size());
for(int i=0;i<a1.size();i++){
System.out.print(a1.get(i)+" ");
}
Collections.sort(a1);
System.out.println(a1);
}
}