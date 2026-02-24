// import java.util.Scanner;
// import java.util.Arrays;
// class SortArray2
// {
// public static void main(String args[])
// {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter the size of array:");
// int size=sc.nextInt();
// int a[]=new int[size];
// System.out.println("enter the "+size+"elements");

// for(int i=0;i<=a.length-1;i++)
// {
// a[i]=sc.nextInt();
// }
// System.out.println("the "+size+"elements are");
// System.out.println(Arrays.toString(a));
// Arrays.sort(a);
// System.out.println("Sorted elements are-");
// System.out.println(Arrays.toString(a));
// }
// }



public class Main
{
	public static void main(String[] args) {
	int arr[]={8,2,3,1,0};
	for(int i=0;i<arr.length-1;i++)
	{
	    for(int j=0;j<arr.length-1-i;j++)
	    {
	        if(arr[j]>arr[j+1])
	        {
	            int temp=arr[j];
	            arr[j]=arr[j+1];
	            arr[j+1]=temp;
	        }
	    }
	}
	for(int num:arr)
	{
	    System.out.print(num+" ");
	}
	}
}
