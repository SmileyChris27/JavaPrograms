import javax.swing.*;
	public class Test4_3{ 
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Enter Original Balance:\n Enter 2: Make a Deposit:\n Enter 3: Make a Cash Withdrawal\n Enter 4: Display Balance\n 5: Quit Program:");
	if (value.equals("1")) Enter_Original_Balance();
	if (value.equals("2")) Make_a_Deposit();
	if (value.equals("3")) Make_a_Cash_Withdrawl();
	if (value.equals("4")) Display_Balance();
	}while(!value.equals("5"));
}
	
	
	/*Row 1*/
	Enter_Original_Balance(){
	
	String value;
	
	double B;
	
	char ansvalue='Y';

	do{
	
	value=JOptionPane.showInputDialog(null, "Original Bank Balance:");
	B=Double.parseDouble(value);
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");

	}while(ansvalue=='y' || ansvalue=='Y');
}

	
	/*Row 2*/
	Make_a_Deposit(){
	
	String value;
	
	double D;
	
	char ansvalue='Y';

	do{
	
	if (B>500)
	JOptionPane.showMessageDialog(null, "Balance is Less than 500:");
	value=JOptionPane.showInputDialog(null, "Deposit:" + (D - .25));
	D=Double.parseDouble(value);
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");

	}while(ansvalue=='y' || ansvalue=='Y');
}
	
	/*Row 3*/
	Make_a_Cash_Withdrawl(){
	
	String value;
	
	double W;
	
	char ansvalue='Y';

	
	value=JOptionPane.showInputDialog(null, "Withdrawl:" + (D - .50));
	W=Double.parseDouble(value);
	if (B<50)
	JOptionPane.showMessageDialog(null, "Balance is Less than 50: " + (B - 1.00));
	if (W<B)
	JOptionPane.showMessageDialog(null, "Balance is Less than 50: " + (B - 1.00));

	
	JOptionPane.showMessageDialog(null, "Your Current Balance is: " + (B));
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");


		}while(ansvalue=='y' || ansvalue=='Y');
  	}
	
	
	/*Row 4*/
	Display_Balance(){
	
	do{
	
	String value;
	
	double B, D, W;
	
	char ansvalue='Y';

	JOptionPane.showMessageDialog(null, "Your Current Balance is: " + (B + D - W));
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");


		}while(ansvalue=='y' || ansvalue=='Y');
  	}
}

	
	



		
	
	
	
	
	