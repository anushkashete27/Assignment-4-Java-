class Employee
{
public Employee(String name)
{
System.out.println("In Employee Constructor, name="+name);
}
}
public class JavaDeveloper extends Employee
{
public JavaDeveloper()
{
super("Anushka");
System.out.println("In JavaDeveloper Constructor");
}

public static void main(String args[])
{
JavaDeveloper j=new JavaDeveloper();
}

}