import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

public class Exercise20_04{

	public static void main(String[] args) throws IOException{
		
	File name=new File("names.txt");		
	Scanner input=new Scanner(name);
	String names1="";
	String names2="";
	
	while(input.hasNext())
	{
		names1=input.next().toLowerCase();
		names2=names1.charAt(0)+"";
		names2=names2.toUpperCase();
		names2=names2+names1.substring(1,names1.length());
		JOptionPane.showMessageDialog(null, "Display Names : " + names2);

	}
	input.close();
	
	}
}