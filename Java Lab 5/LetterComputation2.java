import javax.swing.*;
public class LetterComputation{
	
	public static void main(String[] args){
	
	String value;
	
	double T1, T2, grade=0; /*Test 1, Test 2*/
	
	char SM, L; /*Semester, Letter*/
	
	int C;
	
	value=JOptionPane.showInputDialog(null, "Option 1: Numerical\n Option 2: Letter\n Option 3: Numberical And Letter\nChoice=");
	C=Integer.parseInt(value);

	value=JOptionPane.showInputDialog(null, "Enter Item Test 1:");
	T1=Double.parseDouble(value);

	
	value=JOptionPane.showInputDialog(null, "Enter Item Test 2:");
	T2=Double.parseDouble(value);
	
	
	value=JOptionPane.showInputDialog (null, "Enter 'F' for Fall and 'S' For Spring:");
	SM=value.charAt(0);;
	
	if(SM=='f' || SM=='F') grade=(2*T1+T2)/3;
	else if(SM=='s' || SM=='S') grade=(T1+2*T2)/3;
	else JOptionPane.showMessageDialog(null, "Invalid Semester");
	
	if (grade>90 && grade <=100) L ='A';
	else if (grade>=80 && grade <=79) L = 'B';
	else if (grade>=80 && grade <=79) L = 'C';
	else if (grade>=80 && grade <=79) L = 'D';
	else L = 'F';
	
	if(C==1) JOptionPane.showMessageDialog(null, "Numerical Grade="+grade);
	else if(C==2) JOptionPane.showMessageDialog(null, "Letter Grade="+L);
	else JOptionPane.showMessageDialog (null, "Numerical Grade="+grade+" Letter Grade="+L);
	}
}
	
	