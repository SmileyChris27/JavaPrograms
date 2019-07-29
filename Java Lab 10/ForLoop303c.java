import javax.swing.*;
public class ForLoop303c
{
	public static void main(String[] args){
	String value;
	//double L=1, W; /*Circle, Price*/
	
	for(double L=1, W; L !=0;)
	{
	
		value=JOptionPane.showInputDialog(null, "Enter the length(0-exit):");
		L=Double.parseDouble(value);
		if (L!=0){
		
			value=JOptionPane.showInputDialog(null, "Enter the Width:");
			W=Double.parseDouble(value);
			JOptionPane.showMessageDialog (null,"Area is" + (L * W));
		}
	}
		

	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}
	