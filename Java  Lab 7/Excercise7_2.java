import javax.swing.*;
public class Excercise7_2
{
	public static void main(String[] args){
	String value;

	double M=0, F=0, G=0; /*Midterm, Final, Grade*/
	char L, choice; /*Letter*/

	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter :S Fall Grade:\n Enter: F :Spring Grade\n Enter: U :Summer Grade ");
	choice=value.charAt(0);
	switch (choice)
	{
		
		case 'S': case 's':
		value=JOptionPane.showInputDialog(null, "Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Final:");		
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Fall Grade"+ (M*2+F)/3);
		G =(M*2+F)/3;
	   break;
		case 'F': case 'f':
		value=JOptionPane.showInputDialog(null, "Enter Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Final:");
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Spring Grade"+ (M+F*2)/3);
		G =(M+F*2)/3;
		break;	
		case 'U' : case 'u' :
		value=JOptionPane.showInputDialog(null, "Enter Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Final:");
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Summer Grade"+ (M+F)/2);
		G =(M+F)/2;
		break;
   }
	if (G>=90 && G<=100) L='A';
	else if (G>=80 && G<=89) L='B';
	else if (G>=70 && G<=79) L='C';
	else if (G>=60 && G<=69) L='D';
	else L='F';
	
	JOptionPane.showMessageDialog(null, "Final Number Grade:"+ (F)+ "Letter Grade:" + L);

	

	System.exit(0);
		
	}
}	