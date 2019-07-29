import javax.swing.*;
public class Exercise8_2
{
	public static void main(String[] args){
	String value;
	double D, P=1; /*Circle, Price*/
	
	while(P != 0)
	{
	
		value=JOptionPane.showInputDialog(null, "Enter Price for DVD(0-exit):");
		P=Double.parseDouble(value);
		if(P!=0)
		JOptionPane.showMessageDialog (null,"Total Price is "+ (P + P * 0.085));
		
	}
	
	JOptionPane.showMessageDialog (null,"Thank You for using the program");			
	System.exit(0);
	}
}