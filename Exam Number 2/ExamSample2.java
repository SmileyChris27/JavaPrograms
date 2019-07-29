import javax.swing.*;
public class ExamSample2
{
	public static void main(String[] args){
	String value;

	double R, S; /*Radius, Side*/

	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Circle Problem:\n Enter: 2 :Square Problem\n");
	
	if (value.equals("1"));
	{
							value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Area Computation:\n Enter: 2 :Circumference Computation\n Enter: 3 Area and Circumference Computation");
						
							if (value.equals("1")){
								value=JOptionPane.showInputDialog(null, "Enter a Number:");
								R=Double.parseDouble(value);
								JOptionPane.showMessageDialog (null,"Area Computation"+ (3.14 * R * R));
							}
							if (value.equals("2")){	
								value=JOptionPane.showInputDialog(null, "Enter a Number:");		
								R=Double.parseDouble(value);
								JOptionPane.showMessageDialog (null,"Circumference Computation"+ (2 * 3.14 * R));
							}
							if (value.equals("3")){
								value=JOptionPane.showInputDialog(null, "Enter a Number:");
								R=Double.parseDouble(value);
								JOptionPane.showMessageDialog (null,"Area Computation"+ (3.14 * R * R));
								JOptionPane.showMessageDialog (null,"Circumference Computation"+ (2 * 3.14 * R));
							}

   }
	if (value.equals("2"))
		
						value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Area Computation:\n Enter: 2 :Perimeter Computation\n Enter: 3 Area and Perimeter Computation");
		
		
		if (value.equals("1")){
		value=JOptionPane.showInputDialog(null, "Enter a Number:");
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Area for Square"+ (S * S));
		}
	if (value.equals("2")){
		value=JOptionPane.showInputDialog(null, "Enter a Number:");		
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Perimeter for a Square" + 2 + (S * S));
		}
	if (value.equals("3")){
		value=JOptionPane.showInputDialog(null, "Area and Circumference Computation:");
		S=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Area for Square"+ (S * S));
		JOptionPane.showMessageDialog (null,"Perimeter for a Square" + 2 + (S * S));
		}
	}

		System.exit(0);
	}
}	