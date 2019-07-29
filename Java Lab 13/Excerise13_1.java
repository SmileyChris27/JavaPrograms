import javax.swing.*;
	public class Excerise13_1
	{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: DVD Problem :\n Enter 2: Exit");
	if (value.equals("1")) DVDProblem();
	}
	while(!value.equals("2"));
	}

	
	/*Row 2*/
	static void DVDProblem(){
		String value;
		double D;  /*DVD Price*/ 
		do{
		value=JOptionPane.showInputDialog(null, "Enter Price for DVD:");
		D=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Total Price is "+ (D + D * 0.085));
		}
		while(!value.equals("2"));
		}
}
	
	