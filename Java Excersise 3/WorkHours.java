import java.util.Scanner;
public class WorkHours
{
	public static void main (String[] args)
	{
	double H, R, OT;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter Hours");

	H=input.nextDouble();
	
	System.out.print("Enter Rate");
	
	R=input.nextDouble();
	
	System.out.print("Enter Overtime");
	
	OT=input.nextDouble();
	
	System.out.println("Total is:" +((R*H)+(OT*1.5*R)));
	}
}