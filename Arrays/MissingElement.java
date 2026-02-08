import java.util.*;
class MissingElement
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,7,8};
int n=8;
int expectedsum=n*(n+1)/2;
int currentsum=Arrays.stream(a).sum();
int result=expectedsum-currentsum;
System.out.println(result);
}
}
