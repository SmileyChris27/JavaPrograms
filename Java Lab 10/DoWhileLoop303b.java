import javax.swing.*;
public class DoWhileLoop303b
{
	public static void main(String[] args){
	String value;
	double L=1, W; /*Circle, Price*/
	
	do{
	
		value=JOptionPane.showInputDialog(null, "Enter the length(0-exit):");
		L=Double.parseDouble(value);
		if (L!=0){
		
			value=JOptionPane.showInputDialog(null, "Enter the Width:");
			W=Double.parseDouble(value);
			JOptionPane.showMessageDialog (null,"Area is" + (L * W));
		}
	}
		
	while(L != 0);
		

	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}
	