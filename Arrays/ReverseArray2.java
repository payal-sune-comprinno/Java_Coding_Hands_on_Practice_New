import java.util.Arrays;
class ReverseArray2
{
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7};
        // for(int i=a.length-1;i>=0;i--)
        // {
        //     System.out.print(a[i]+" ");
        // }
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }



    }
}