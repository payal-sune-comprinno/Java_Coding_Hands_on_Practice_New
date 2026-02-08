class SecondLargestDigit
{
    public static void main(String args[])
    {
        int n=1245;
        int r=secondLargestdigit(n);
        System.out.println(r);

    }
    public static int secondLargestdigit(int n)
{
    int a=n;
    int large=n%10;
    while(n!=0)
    {
        int d=n%10;
        
        if(d>large)
        {
            large=d;
        }
        n=n/10;
    }
    int small=a%10;
    while(a!=0)
    {
        int m=a%10;
        if(m>small && m!=large)
        {
            small=m;
        }
        m=m/10;
    }
return small;
}
}
