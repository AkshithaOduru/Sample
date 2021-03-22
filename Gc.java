class Gc
{
protected void finalise()
{
System.out.print("object reference collected");
}
public static void main(String args[])
{
Gc g=new Gc();
Gc g1=new Gc();
g=null;
g1=null;
System.out.print("hi");
System.gc();
}
}