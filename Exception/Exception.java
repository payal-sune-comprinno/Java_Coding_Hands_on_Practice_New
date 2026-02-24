
class Main{
public static void checkAge(int n){
if(n<18){
throw new ArithmeticException("Age is less than 18");
}
else{
System.out.println("You are eligible to vote");
}
}
public static void main(String[] args){
int a=10;
int b=0;
int arr[]={10,20,30,40};
//try catch block-Arithmetic Exception
try{
int c=a/b;
System.out.println(c);
}
catch(Exception e){
System.out.println(e);
}
//finally exected after the try and catch
try{
System.out.println(arr[9]);
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("Executed");
}
try{
int c=a/b;
System.out.println(arr[9]);
}
catch(ArithmeticException e){
System.out.println("divide by zero");
}
catch(Exception e){
System.out.println(e);
}
//NUll Pointer Exception
String name=null;
try{
System.out.println(name.length());
}
catch(Exception e){
System.out.println(e);
}
//Number Format Exception
String s="abc";
int n=Integer.parseInt(s);
System.out.println(n);
//throw
checkAge(14);
}
}