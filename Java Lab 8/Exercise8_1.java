import javax.swing.*;
public class Exercise8_1
{
	public static void main(String[] args){
	String value;
	char choice, ansvalue='y';
	double D, P; /*Circle, Price */
	
	while(ansvalue=='y' || ansvalue=='Y'){
	
	value=JOptionPane.showInputDialog(null, "Enter Price for DVD:");
	P=Double.parseDouble(value);
	JOptionPane.showMessageDialog (null,"Total Price is "+ (P + P * 0.085));
					 
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");	
	ansvalue=value.charAt(0);
	}
	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}