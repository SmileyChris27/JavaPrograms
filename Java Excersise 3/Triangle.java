import java.util.Scanner;
public class Triangle
{
	public static void main(String[] args)
	{
	double b, h;
	
	Scanner input=new Scanner(System.in);
	
	b=input.nextDouble();
	
	System.out.print("Enter Base");
	
	h=input.nextDouble();
	
	System.out.print("Enter Height");
	
	System.out.println("area is:" +(b*h*0.5));
	}
}
	
	