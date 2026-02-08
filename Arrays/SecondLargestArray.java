class SecondLargestArray
{
    public static void main(String[] args) {
        int a[]={5,6,2,1,8};
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
            }
             for(int i=0;i<a.length;i++)
            {
                if(a[i]>secondmax && a[i]!=max)
                {
                    secondmax=a[i];
                }
            }
            System.out.println(secondmax);
        }
    }
