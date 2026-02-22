import java.util.*;
class GenerateBinary
{
    public static void generate(int n)
    {
        Queue<String> q1=new LinkedList<>();
        q1.add("1");
        for(int i=0;i<n;i++)
        {
            String front=q1.poll();
            System.out.println(front);
            q1.add(front+"0");
            q1.add(front+"1");
        }
    }
    public static void main(String[] args) {
        int N=5;
        generate(N);
        
    }
}