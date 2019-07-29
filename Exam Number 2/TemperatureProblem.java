import javax.swing.*;
public class TemperatureProblem
{
	public static void main(String[] args){
	String value;

	double N; /*Number*/
	double C; /*Celsius*/
	

	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Increment/Decrement Problem:\n Enter: 2 :Temperature Problem");

	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter a number:");
		N=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Increment" + (N + 1));
		JOptionPane.showMessageDialog (null,"Decrement" + (N - 1));
	}
	if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter a number for Celsius:");
		C=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Fahrenheit is "+ (9*C/5+32));
	}
	
	System.exit(0);
	}
}	