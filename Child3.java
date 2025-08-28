interface Father
{
public abstract void bringWater();
}
interface Mother
{
public abstract void bringWater();
}
public class Child3 implements Father,Mother
{
public void bringWater()
{
System.out.println("Brought water for father and mother");
}
public static void main(String args[])
{
Child3 c=new Child3();
c.bringWater();
}
}