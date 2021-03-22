class Rectangle
{
int length;
int bredth;
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
Rectangle(float l,float b)
{
length=l;
bredh=b;
}
void area()
{
System.out.println("area"+(length*bredth));
}
}
public static void main(String args[])
{
Rectanglr r=new Rectanglr();
Rectangle r=new Rectangle(10,20);
Rectangle r=new Rectangle(10.2,20.2);
r.area();
}

