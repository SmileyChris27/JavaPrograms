import javax.swing.*;
public class Exam5{
	public static void main(String[] args){
	
	String value;
	
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Basic Math Problems :\n Enter 2: Exit:");
	if (value.equals("1")) Basic_Math_Problem();
	}while(!value.equals("2"));
}

	static void Basic_Math_Problem(){
	
	String value;
	
	char ansvalue='Y';
	
	double S, S1, D, D1, P, P1, SDP, SDP1; /*Sum, Diffrence, Product*/
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Sum :\n Enter 2: Diffrence: \n Enter 3: Product\n Enter 4: Sum, Diffrence And Product\n Enter 5: Exit");
	
	
	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		S=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		S1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Sum of the 2 numbers is " + Sum (S, S1));
	}
	
	if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		D=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		D1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Difference of the 2 numbers is " + Difference (D, D1));
	}
	
	if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		P=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		P1=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"The Product of the 2 numbers is " + Product (P, P1));
	}
	
	if (value.equals("4")){
		value=JOptionPane.showInputDialog(null, "Enter Number 1:");
		S=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Number 2:");
		S1=Double.parseDouble(value);

		
		JOptionPane.showMessageDialog (null,"The Sum of the 2 numbers is " + Sum (S, S1));
		JOptionPane.showMessageDialog (null,"The Difference of the 2 numbers is " + Difference (S, S1));
		JOptionPane.showMessageDialog (null,"The Product of the 2 numbers is " +  Product (S, S1));
	}


	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
	ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
	
}

	
	static double Sum(double x, double y){ 
  	return x+y;
	}

	static double Difference(double D, double D1){ 
  	return D-D1;
	}
	
	static double Product(double P, double P1){ 
  	return P*P1;
	}

}


