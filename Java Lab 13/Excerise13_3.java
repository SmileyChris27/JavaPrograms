import javax.swing.*;
	public class Excerise13_3
	{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: DVD Problem :\n Enter 2: Age Problem:\n 3: Exit:");
	if (value.equals("1")) DVDProblem();
	else if (value.equals("2")) AgeProblem();
	}
	while(!value.equals("3"));
	}

	
	/*Row 2*/
	static void DVDProblem(){
		String value;
		double D;  /*DVD Price*/ 

		value=JOptionPane.showInputDialog(null, "Enter Price for DVD:");
		D=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Total Price is "+ (D + D * 0.085));


		}


	/*Row 3*/
		static void AgeProblem(){
		String value;
		double CY, CM, BY, YB, BM;  /*Current Year, Current Month, Birth Year, Birth Month*/ 
		


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
		
	}


	
	