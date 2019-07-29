// This program is used for values /
import java.util.*;
public class CalculationForTests
{
	public static void main(String args[])
	{
	
		double test1, test2, test3 ;
		Scanner input =new Scanner(System.in);			
		System.out.print("Test1:");
		test1 = input.nextDouble();
		System.out.print("Test2:");
		test2 = input.nextDouble();
      System.out.print("Test3:");
		test3 = input.nextDouble();

		
		System.out.println("grade: " + (.25*test1+.61*test2+.14*test3));
      }
}