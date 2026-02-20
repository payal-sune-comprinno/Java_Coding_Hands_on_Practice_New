import java.util.*;
class Main {
public static void main(String[] args) {
HashMap<String,Integer> map=new HashMap<>();
map.put("payal",1);
map.put("xyz",4);
map.put("pqr",3);
map.put("abc",5);
System.out.println(map);
System.out.println(map.get("xyz"));
System.out.println(map.containsKey("abc"));
System.out.println(map.containsValue(99));
System.out.println(map.containsValue(4));
}
}