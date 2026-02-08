import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="hello every one";
	    String m=ConvertOppositeCase(s);
	    System.out.println(m);
		
	}
	public static String ConvertOppositeCase(String s)
	{
	    StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{
	    char ch=s.charAt(i);
	    if(Character.isLowerCase(ch))
	    {
	        sb.append(Character.toUpperCase(ch));
	    }
	   else
        {
            sb.append(Character.toLowerCase(ch));
            
        }

}
return sb.toString();
}
}