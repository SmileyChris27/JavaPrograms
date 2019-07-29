import javax.swing.*;
public class RectangleAreaPerimeter
{
	public static void main(String[] args){
	String value;

	double L, W; /*Length, Width*/

	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Area Caculation:\n Enter: 2 :Perimeter Calculation\n Enter 3: Perimeter and Area Calculation");

	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter Length:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width:");		
		W=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Rectangle Area is "+ (L * W));
	}
	else if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter Length:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width:");
		W=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Rectangle Perimeter"+ (2 * L + 2 * W));
		}
	
	else if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Enter Length:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width:");
		W=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Rectangle Area is "+ (L * W));
		JOptionPane.showMessageDialog (null,"Rectangle Perimeter"+ (2 * L + 2 * W));
		}
		System.exit(0);
	}
}	