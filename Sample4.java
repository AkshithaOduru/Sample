class Rectangle
{
double length;
double bredth;
Rectangle()
{
length=20;
bredth=40;
}
Rectangle(int l,int b)
{
length=l;
bredth=b;
}
Rectangle(double x,double y)
{
length=x;
bredth=y;
}
void area()
{
System.out.println("area"+(length*bredth));
}
}
class Sample4
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(10,20);
Rectangle r3=new Rectangle(10.2f,20.2f);
r1.area();
r2.area();
r3.area();
}
}


