class Rectangle
{
int length;
int bredth;
Rectangle(int l,int b)
{
length=l;
bredth=b;
}
void area()
{
System.out.println("area"+(length*bredth));
}
}
class Sample3
{
public static void main(String args[])
{
Rectangle r=new Rectangle(20,30);
r.area();
}
}
