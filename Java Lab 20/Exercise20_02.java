import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

public class Exercise20_02{

	public static void main(String[] args) throws IOException{
	
	File grade=new File("grades.txt");		
	Scanner input=new Scanner(grade);
	while(input.hasNext())
	{
		double grade1=input.nextDouble();
		JOptionPane.showMessageDialog(null, "Display Grades : " + grade1);
	}
	input.close();
	
	}
}