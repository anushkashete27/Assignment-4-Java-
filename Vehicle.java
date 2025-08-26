final class Vehicle
{
final int wheels=4;
final void start()
{
System.out.println("Vehicle have "+ wheels+" wheels");
}

public static void main(String args[])
{
Vehicle v=new Vehicle();
v.start();
}
}