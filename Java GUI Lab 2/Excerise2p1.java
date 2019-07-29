import javax.swing.*;
public class Excerise2p1
{
	public static void main(String[] args)
	{
		String value;
		
		double inches,feet;
		
		value=JOptionPane.showInputDialog(null, "Enter Inches:");
		
		inches=Double.parseDouble(value);
		
		feet=inches/12;
		JOptionPane.showMessageDialog (null,"Total feet is "+feet);
		System.exit(0);
		
	}
}
		