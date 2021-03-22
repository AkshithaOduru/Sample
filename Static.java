class Variable
{
static int x=10;
static void display()
{
System.out.println(x);
}
}
class Static
{
public static void main(String a[])
{
Variable v=new Variable();
Variable v1=new Variable();
v.x++;
v.display();
v1.display();
}
}