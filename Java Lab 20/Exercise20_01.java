import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

public class Exercise20_01{

	public static void main(String[] args) throws IOException{

	
	File Number=new File("numbers.txt");  /*Making a File*/
	Scanner input=new Scanner(Number);		/*Reading a File*/
	while(input.hasNext())
	{
		double number=input.nextDouble();
		JOptionPane.showMessageDialog(null, "Display numbers: " + number);
	}
	input.close();
	
	}
}