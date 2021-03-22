class Rectangle
{
int len;
int bre;
Rectangle()
{
len=30;
bre=20;
}
void area()
{
System.out.println("area"+(len*bre));
}
}
class Sample1
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.area();
}
}
