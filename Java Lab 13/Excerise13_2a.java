import javax.swing.*;
	public class Excerise13_2a{
	public static void main(String[] args){
	DVDProblem();
	}


	static void DVDProblem(){
		String value;
		double CY, CM, BY, YB, BM;  /*Current Year, Current Month, Birth Year, Birth Month*/ 
		char ansvalue='Y';
		do{
		value=JOptionPane.showInputDialog(null, "Enter Current Year:");
		CY=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Year Born:");
		YB=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Current Month:");
		CM=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Birth Month:");
		BM=Double.parseDouble(value);
		if (CM<BM){
		CY--;
		CM = 12 + CM;
		}
		JOptionPane.showMessageDialog (null,"Your Age is" + (CY - YB));
		JOptionPane.showMessageDialog (null,"Current Month" + (CM - BM));
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
      ansvalue=value.charAt(0);
	}
	while(ansvalue=='y' || ansvalue=='Y');

	}
}

	
