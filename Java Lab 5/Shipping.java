import javax.swing.*;
public class Shipping
{
	public static void main(String[] args){
	String value;

	double IP, S, ES=5, ON=10; /*Item Price, Shipping, Express Shipping, Overnight Shipping*/

	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Normal/Free Shipping Over $100 Dollars:\n Enter: 2 :Express Shipping\n Enter 3: Overnight Shipping");

	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Item Price:");
		IP=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Normal and over $100" + (IP * 1.10));
	}
	else if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Item Price:");
		IP=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Express Shipping" + (IP * 1.10 + ES));
	}
	
	else if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Item Price:");
		IP=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Overnight Shipping" + (IP * 1.10 + ON));
		
	}

	System.exit(0);
	}
}