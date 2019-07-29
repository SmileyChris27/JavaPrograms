import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

public class Exercise20_03{

	public static void main(String[] args) throws IOException{
		
	File name=new File("names.txt");		
	Scanner input=new Scanner(name);
	while(input.hasNext())
	{
		String names1=input.next();
		JOptionPane.showMessageDialog(null, "Display Names : " + names1);
	}
	input.close();
	
	}
}