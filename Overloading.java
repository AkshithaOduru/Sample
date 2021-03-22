class Method
{
int x=5;
void square(int x)
{
System.out.println(x*x);
}
void square()
{
System.out.println(x+x);
}
}
class Overloading
{
public static void main(String a[])
{
Method m=new Method();
m.square(10);
m.square();
}
}