import javax.swing.*;
class Exercise14_1{
	public static void main(String args []){
	
	String value;
	
	double P, T=0;
	
	
  	 	value=JOptionPane.showInputDialog(null, "Enter DVD Price:");
	 	P=Double.parseDouble(value);
		T=dvdPrice(P);
		JOptionPane.showMessageDialog(null, "Total Price" + (T));
				
		JOptionPane.showMessageDialog(null, "Thank you");
  }

 	static double dvdPrice(double P)
	{
		return(P+P*.085);
	}   
}
