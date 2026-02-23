
//remove dupliactes from an array
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,3,2,4,1};
       HashSet<Integer> set=new HashSet<>();
       for(int num:arr)
       {
           set.add(num);
       }
       for(int x:set)
       {
           System.out.print(x+" ");
       }
    }
}