import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String s="123@Payal56";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sum=sum+s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}