class RightOrLeftRotation
{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n=a.length;
        int k=2;//a[i]=a[(n%k)-2]

        //Right rotation
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[(i+k)%n]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(r[i]+" ");
        }
    System.out.println("**************");
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
             m[i]=a[(i+k)%n];
             //m[(i+n-k)%n]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(m[i]+" ");
        }
       
    }
}