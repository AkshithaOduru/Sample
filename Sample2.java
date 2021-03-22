class Triangle
{
int base;
int height;
Triangle()
{
base=10;
height=15;
}
void area()
{
System.out.println("area"+((base*height)/2));
}
}
class Sample2
{
public static void main(String args[])
{
Triangle t=new Triangle();
t.area();
}
}