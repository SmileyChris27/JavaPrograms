import javax.swing.*;
public class MidtermFinal2
{
	public static void main(String[] args){
	String value;

	double M=0, F=0, G=0; /*Midterm, Final, Grade*/
	char L; /*Letter*/

	value=JOptionPane.showInputDialog(null, "Which will you use?\n Enter 1: Fall Grade:\n Enter: 2 :Spring Grade\n Enter 3 :Summer Grade ");
	
	
	if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Final:");		
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Fall Grade"+ (M*2+F)/3);
		G =(M*2+F)/3;
	}
	else if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Final:");
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Spring Grade"+ (M+F*2)/3);
		G =(M+F*2)/3;
		}
	
	else if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Enter Midterm:");
		M=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Final:");
		F=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Summer Grade"+ (M+F)/2);
		G =(M+F)/2;
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