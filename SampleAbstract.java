abstract class BankAccount
{
public void getDetails()
{
System.out.println("Personal Details");
}
public abstract void deposit();
public abstract void withdrawl();
public abstract void checkbalance();
}

class Saving extends BankAccount
{
public void deposit()
{
System.out.println("10000 rs is deposited in saving account");
}
public void withdrawl()
{
System.out.println("2000 rs is withdrawl in saving account");
}
public void checkbalance()
{
System.out.println("2000 rs is checkbalance in saving account");
}
}
class Current extends BankAccount
{
public void deposit()
{
System.out.println("50000 rs is deposited in current account");
}
public void withdrawl()
{
System.out.println("3000 rs is withdrawl in current account");
}
public void checkbalance()
{
System.out.println("8000 rs is checkbalance in current account");
}
}
public class SampleAbstract
{

public static void main(String args[])
{
BankAccount b1=new Saving();
b1.getDetails();
b1.deposit();
b1.withdrawl();
b1.checkbalance();
BankAccount b2=new Current();
b2.getDetails();
b2.deposit();
b2.withdrawl();
b2.checkbalance();


}
}
