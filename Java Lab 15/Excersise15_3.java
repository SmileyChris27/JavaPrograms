import javax.swing.*;
	public class Excersise15_3{
	public static void main(String[] args){
	
	String value;

	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: DVD Problem :\n Enter 2: Grade Problem\n Enter 3: Exit:");
	if (value.equals("1")) DVD_Problem();
	if (value.equals("2")) Grade_Problem();
	}while(!value.equals("3"));
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


	
	static void Grade_Problem(){
	
		int M, F, G; /*Midterm, Final, Grade*/
		
		String value;
	 	
		value=JOptionPane.showInputDialog(null, "Enter an Midterm:");
	 	M=Integer.parseInt(value);
	 	value=JOptionPane.showInputDialog(null, "Enter an Final:");
	 	F=Integer.parseInt(value);
	 	JOptionPane.showMessageDialog(null, "Letter Grade: "+ letterGrade(M, F));
  }
  
  static char letterGrade(int M, int F)
  {
  	 char letter='A';
  	 double G=(M+F)/2;
	 if(G>=90) letter='A';
	 else if(G>=80) letter='B';
	 else if(G>=70) letter='C';
	 else if(G>=60) letter='D';
	 else G='F';
	 return letter;
  }
}  			