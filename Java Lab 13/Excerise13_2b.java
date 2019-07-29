import javax.swing.*;
	public class Excerise13_2b{
	public static void main(String[] args){

	
	String value;


	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Age Problem:\n Enter 2: Exit");
	if (value.equals("1")) AgeProblem();
	}
	while(!value.equals("2"));
	}
	
	/*Row 2*/
	static void AgeProblem(){
		String value;
		double CY, CM, BY, YB, BM;  /*Current Year, Current Month, Birth Year, Birth Month*/ 
		do{

		value=JOptionPane.showInputDialog(null, "Enter Current Year:");
		CY=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Year Born:");
		YB=Double.parseDouble(value);
		do{
			value=JOptionPane.showInputDialog(null, "Enter Current Month:");
			CM=Double.parseDouble(value);
			if(CM>12) JOptionPane.showMessageDialog (null,"Current Month must be between 1-12");
		
		}
		while(CM>12);
		value=JOptionPane.showInputDialog(null, "Enter Birth Month:");
		BM=Double.parseDouble(value);
		
		if (CM<BM){
		CY--;
		CM = 12 + CM;
		}
		
		JOptionPane.showMessageDialog (null,"Your Age is" + (CY - YB));
		JOptionPane.showMessageDialog (null,"Current Month" + (CM - BM));

	}
	
	while(!value.equals("2"));
		}
	}


