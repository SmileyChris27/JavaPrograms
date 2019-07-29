import javax.swing.*;
public class Exercise9_3
{
	public static void main(String[] args){
	String value;
	double L, W; /*Length Width*/
	char choice=1;
	
	
	while(choice!='2'){

	
		value=JOptionPane.showInputDialog(null, "Which will you use?\n 1: Rectangle Problem:\n 2.: Exit");
		choice=value.charAt(0);
		if (choice == '1'){
		value=JOptionPane.showInputDialog(null, "Enter the Length:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter the Width:");
		W=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Area is:" + (L * W));
			
		
		}
	}
	System.exit(0);
}
}