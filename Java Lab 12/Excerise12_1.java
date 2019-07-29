import javax.swing.*;
	public class Excerise12_1
	{
	public static void main(String[] args)
	{
		evenOddProblem();
	}
	
	static void evenOddProblem()
	{
		String value;
		int N;  /*Number*/ 
		value=JOptionPane.showInputDialog(null, "Enter an Number:");
		N=Integer.parseInt(value);
		if (N%2==0) JOptionPane.showMessageDialog(null, "Number is even");
		else JOptionPane.showMessageDialog(null, "Number is odd");
		}
}
		