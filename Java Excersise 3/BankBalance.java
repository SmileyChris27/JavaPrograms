import java.util.Scanner;
public class BankBalance
{
	public static void main (String[] args)
	{
	double B, DA, W;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Bank Balance");

	B=input.nextDouble();
	
	System.out.print("Deposit Amount");

	DA=input.nextDouble();
	
	System.out.print("Withdrawl");

	W=input.nextDouble();
	
	System.out.println("Original Bank Balance is:"+ B);
	System.out.println("Deposit Amount:"+ DA);
	System.out.println("Withdrawal:"+ W);
	System.out.println("Final Sales Price:"+ (B+DA-W));
	}
}