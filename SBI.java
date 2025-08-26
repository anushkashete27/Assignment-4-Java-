class RBI
{
public int roi()
{
return 5;
}
}
public class SBI extends RBI
{
public int roi()
{
return 9;
}

public static void main(String args[])
{
SBI r=new SBI();
System.out.println("ROI is:"+r.roi());
}
}