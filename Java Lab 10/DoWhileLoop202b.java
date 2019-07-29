import javax.swing.*;
public class DoWhileLoop202b
{
	public static void main(String[] args){
	String value;
	char choice, ansvalue='y';
	double L, W; /*Length, Width*/
	
	do{	
			value=JOptionPane.showInputDialog(null, "Enter Legnth:");
			L=Double.parseDouble(value);
			value=JOptionPane.showInputDialog(null, "Enter Width:");
			W=Double.parseDouble(value);
			JOptionPane.showMessageDialog (null,"The Area Is "+ (L * W));
							 
			
			value=JOptionPane.showInputDialog("Cotinue(Y/N)?");	
			ansvalue=value.charAt(0);
			}
			while(ansvalue=='y' || ansvalue=='Y');
	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}