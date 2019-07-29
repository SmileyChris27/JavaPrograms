import javax.swing.*;
	public class Excersise15_1{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: DVD Problem :\n Enter 2: Exit:");
	if (value.equals("1")) DVD_Problem();
	}while(!value.equals("2"));
}

	static void DVD_Problem(){
	
	String value;
	
	double P, T=0;
	
	
  	 	value=JOptionPane.showInputDialog(null, "Enter DVD Price:");
	 	P=Double.parseDouble(value);
		T=dvdPrice(P);
		JOptionPane.showMessageDialog(null, "Total Price" + (T));
				
		JOptionPane.showMessageDialog(null, "Thank you");
  }

 	static double dvdPrice(double P){
		return(P+P*.085);
	}
}
