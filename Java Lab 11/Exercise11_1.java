import javax.swing.*;
public class Exercise11_1
{
	public static void main(String[] args){
	String value;

	double L, W, S; /*Length, Width*/
	
	
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Square:\n Enter: 2 :Rectangle\n Enter 3: Exit");

		
	
	do{
	
	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Area Caculation (Rectangle):\n Enter: 2 :Perimeter Calculation (Rectangle)\n Enter 3: Perimeter and Area Calculation (Rectangle)");

	
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
	}
		
	while(!value.equals("3"));
	
		value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Area Caculation (Square):\n Enter: 2 :Perimeter Calculation (Square)\n Enter 3: Perimeter and Area Calculation (Square)");

	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter Side:");	
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Square Area is"+ (S * S));
	}
	else if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter Side:");
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Square Perimeter"+ (4 * S));
		}
	

	else if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Enter Side:");
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Square Area is"+ (S * S));
		JOptionPane.showMessageDialog (null,"Square Perimeter"+ (4 * S));
		}
	}
		
	while(!value.equals("3"));
	
		

		
	System.exit(0);
	}
}	