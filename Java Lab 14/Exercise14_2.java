import javax.swing.*;
class Exercise14_2
{
  public static void main(String[] args)
  {
  
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