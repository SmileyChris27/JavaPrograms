import javax.swing.*;
	public class Test4_2{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Grade Problem :\n Enter 2: Exit:");
	if (value.equals("1")) Grade_Problem();
	}while(!value.equals("2"));
}
	
	
	static void Grade_Problem(){	
	
	double M, F, G, LG , HG, C=0, L ;
	
	String value;
	
	char ansvalue='Y';
	
	
	
	do{
	
	value=JOptionPane.showInputDialog(null, "Midterm:");
	M=Double.parseDouble(value);
	value=JOptionPane.showInputDialog(null, "Final:");		
	F=Double.parseDouble(value);
	G = M + F;
	if (C==0){
		LG=HG=G;
		C++;
		JOptionPane.showMessageDialog(null, "Your Average is :" + ((M + F) /2));
	}

	if (G>=90 && G<=100) L='A';
	else if (G>=80 && G<=89) L='B';
	else if (G>=70 && G<=79) L='C';
	else if (G>=60 && G<=69) L='D';
	else L='F';

	JOptionPane.showInputDialog(null, "Would You like to continue press Y if not press N");

	}while(ansvalue=='y' || ansvalue=='Y');
	}
}
	