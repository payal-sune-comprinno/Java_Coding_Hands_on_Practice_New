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
         int arr[]={4,1,5,2,3};
         for(int i=1;i<arr.length;i++)
         {
             int current=arr[i];
             int j=i-1;
             while(j>=0 && current<arr[j])
             {
                 arr[j+1]=arr[j];
                 j--;
             }
             arr[j+1]=current;
         }
        
        printarray(arr);
        
       
        
            
            
            
    }
}