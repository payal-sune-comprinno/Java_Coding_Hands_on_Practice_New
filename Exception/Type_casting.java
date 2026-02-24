
class Main{
public static void main(String[] args){
//Type Casting
//widenining type conversion-automatically
//byte->short->char->int->long->float->double
int m=9;
long n=m;
System.out.println(n);
//Narrowing type conversion-manually
//double->float->long->int->char->short->byte
int a=7;
byte b=(byte)a;
System.out.println(b);
}
}