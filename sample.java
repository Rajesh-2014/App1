class sample{
static int i=10;
int j=20;
static {
System.out.println("static block");
}
{
System.out.println("nonstatic block");
}
sample(){
System.out.println("constructor");
}
static void m1(){
System.out.println("static m1 method");
}
void m2(){
System.out.println("m2 method");
}
public static void main(string array[]args){
System.out.println("main method");
}
}