import javax.swing.*;
public class Exam3
{
	public static void main(String[] args){
	
	String value;
	String value2;
	
	double S, S1, D, D1, P, P1, SDP, SDP1; /*Sum, Diffrence, Product*/
	
	do{
		value2=JOptionPane.showInputDialog(null, "Main Menu\n 1. Sum\n 2. Diffrence\n 3. Product\n 4. Sum, Diffrence And Product\n 5. Exit");
	
		if (value2.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		S=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		S1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Sum of the 2 numbers is "+ (S + S1));
	}
	
		if (value2.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		D=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		D1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Diffrence of the 2 numbers is "+ (D - D1));
	}
	
	if (value2.equals("3")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		P=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		P1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Product of the 2 numbers is "+ (P * P1));
	}
	
	if (value2.equals("4")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		SDP=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		SDP1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Sum of the 2 numbers is "+ (SDP + SDP1));
		JOptionPane.showMessageDialog (null,"The Diffrence of the 2 numbers is "+ (SDP - SDP1));
		JOptionPane.showMessageDialog (null,"The Product of the 2 numbers is "+ (SDP * SDP1));
	}
}
	while(!value2.equals("5"));
	}
}
	



	

	
		

	

	
