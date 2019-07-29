import javax.swing.*;
	public class Excerise13_2c{
	public static void main(String[] args){
	
	AgeProblem();
	}
	
	
	static void AgeProblem(){
		String value;
		double CY, CM, BY, YB, BM;  /*Current Year, Current Month, Birth Year, Birth Month*/ 
		
		do{
		value=JOptionPane.showInputDialog(null, "Enter Current Year(0 to Exit):");
		CY=Double.parseDouble(value);
		if( CY !=0)
		{
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
			while(CY !=0 );
			}
		}


