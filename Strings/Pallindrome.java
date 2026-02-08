public class Main
{
	public static void main(String[] args) {
   System.out.println(palindrome("mam"));
 
	
}


public static boolean palindrome(String s) {
    int n = s.length();
    int start = 0;
    int end = n - 1;
    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}