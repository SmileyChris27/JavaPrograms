import javax.swing.*;
	public class Excerise12_2
	{
	public static void main(String[] args)
	{
		gradeProblem();
	}
	
	static void gradeProblem()
	{
		String value;
		int M, F, G;  /*Midterm, Final, Grade*/ 
		value=JOptionPane.showInputDialog(null, "Enter Midterm:");
		M=Integer.parseInt(value);
		value=JOptionPane.showInputDialog(null, "Enter Final:");
		F=Integer.parseInt(value);
		JOptionPane.showMessageDialog(null, "Average Grade" + (M+F)/2);
		}
}
		