// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={4,1,5,2,3};
        for(int i=0;i<a.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[smallest]>a[j])
                {
                    smallest=j;
                }
                
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        printarray(a);
        
       
        
            
            
            
    }
}