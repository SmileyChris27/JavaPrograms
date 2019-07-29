import javax.swing.*;
public class Exercise2p4
{
	public static void main(String[] args)
	{
	
		String value;
		double price;
		value=JOptionPane.showInputDialog(null, "Enter First Integer :");
		price=Double.parseDouble(value);
		total=price+price*.085;
		JOptionPane.showMessageDialog(null,"Total price is "+total);
		System.exit(0);
		}
}