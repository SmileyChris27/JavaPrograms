import javax.swing.*;
	public class Excersise14_4
	{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: DVD Problem :\n Enter 2: Grade Problem:\n 3: Circle Problem\n 4: Exit:");
	if (value.equals("1")) DVD_Problem();
	if (value.equals("2")) Grade_Problem();
	if (value.equals("3")) Circle_Problem();
	}while(!value.equals("4"));
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

	
	static void Circle_Problem(){
	
	 	double R; /*Radius*/
		
		String value;
	 	
		
		
		value=JOptionPane.showInputDialog(null, "Enter radius:");
	 	R=Double.parseDouble(value);
	 	
		JOptionPane.showMessageDialog(null, "Area: " + CalcArea(R));
		JOptionPane.showMessageDialog(null, "Circumference: " + CalcCircumference(R));
  }
  
  static double CalcArea(double R) { 
  return R*R*3.14;  
  }
  static double CalcCircumference(double R){ 
  return 2*R*3.14;
  }

}

