import javax.swing.*;
public class Exercise2p2
{
	public static void main(String[] args)
	{
	
		String value;
		double price,total;
		value=JOptionPane.showInputDialog(null, "Enter DVD Player price:");
		price=Double.parseDouble(value);
		total=price+price*.085;
		JOptionPane.showMessageDialog(null,"Total price is "+total);
		System.exit(0);
		}
}