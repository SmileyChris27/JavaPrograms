import javax.swing.*;
public class Exercise9_1
{
	public static void main(String[] args){
	String value;
	char choice, ansvalue='y';
	double L, W; /*Length, Width*/
	
	while(ansvalue=='y' || ansvalue=='Y'){
	
	value=JOptionPane.showInputDialog(null, "Enter Legnth:");
	L=Double.parseDouble(value);
	value=JOptionPane.showInputDialog(null, "Enter Width:");
	W=Double.parseDouble(value);
	JOptionPane.showMessageDialog (null,"The Area Is "+ (L * W));
					 
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");	
	ansvalue=value.charAt(0);
	}
	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}