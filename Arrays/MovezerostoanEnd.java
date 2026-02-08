// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,0,0,4,5,6};
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        while(k<arr.length)
        {
            arr[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(arr));
       
        
    }
}