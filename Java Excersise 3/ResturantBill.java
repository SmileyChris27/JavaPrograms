import java.util.Scanner;
public class ResturantBill
{
	public static void main (String[] args)
	{
	double M, TA, TI;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Meal");

	M=input.nextDouble();
	
	System.out.println("Charge for meal:"+ M);
	System.out.println("Tax:"+ M*1.0675);
	System.out.println("Tip:"+ M*1.0675*0.20);
	System.out.println("Total:"+ (M*1.0675*1.20));
	}
}