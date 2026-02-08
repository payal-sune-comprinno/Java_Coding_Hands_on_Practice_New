import java.util.Scanner;
import java.util.Arrays;
class SortArray2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the "+size+"elements");

for(int i=0;i<=a.length-1;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the "+size+"elements are");
System.out.println(Arrays.toString(a));
Arrays.sort(a);
System.out.println("Sorted elements are-");
System.out.println(Arrays.toString(a));
}
}
