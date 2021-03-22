class Variables
{
int x=10;
void display()
{
System.out.print(x);
}
}
class Instance
{
public static void main(String a[])
{
Variables v=new Variables();
Variables v1=new Variables();
v.x++;
v.display();
v1.display();
}
}