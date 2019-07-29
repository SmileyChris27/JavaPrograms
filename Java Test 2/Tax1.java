// This program is used for values /
import java.util.*;
public class Tax1
{
	public static void main(String args[])
	{
	
		double Price ;
		Scanner input =new Scanner(System.in);			
		System.out.print("Enter DVD Player Price:");
		Price = input.nextDouble();
		
		System.out.println("Total is: " + (Price+Price*.085));
      }
}