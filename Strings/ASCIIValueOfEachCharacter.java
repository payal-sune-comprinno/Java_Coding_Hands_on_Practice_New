import java.util.*;
public class ASCIIValueOfEachCharacter
{
	public static void main(String[] args) {
	String s="payal";
    
    for(int i=0;i<s.length();i++)
    {
        int m=(int)s.charAt(i);
        System.out.println(s.charAt(i)+" =>"+m);
	}	
	}
	
}