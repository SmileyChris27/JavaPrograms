import javax.swing.*;
public class Exercise8_3
{
	public static void main(String[] args){
	String value;
	double P, E ; /*Price*/
	char choice=1;
	
	
	while(choice!='2'){

	
		value=JOptionPane.showInputDialog(null, "Which will you use?\n 1: DVD Problem:\n 2.: Exit");
		choice=value.charAt(0);
		if (choice == '1'){
		value=JOptionPane.showInputDialog(null, "Enter Price for DVD:");
		P=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Total Price is "+ (P + P * 0.085));
			
		
		}
	}
	System.exit(0);
}
}