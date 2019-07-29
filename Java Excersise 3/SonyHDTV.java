import java.util.Scanner;
public class SonyHDTV
{
	public static void main (String[] args)
	{
	double P, D, FS;
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter Price of Sony HD TV");

	P=input.nextDouble();
	
	D=P * 0.2;
	
	FS=P - D;
	
	System.out.println("Original Price is:"+ P);
	System.out.println("Discount is:"+ D);
	System.out.println("Final Sale Price is:"+ FS);
	}
}