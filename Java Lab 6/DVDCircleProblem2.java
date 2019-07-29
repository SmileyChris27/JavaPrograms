import javax.swing.*;
public class DVDCircleProblem2
{
	public static void main(String[] args){
	String value;
	char choice;
	double D, P, C; /*Circle, DVD, Circle Problem*/
	double R; /*Radius Square of 2 */
	

	value=JOptionPane.showInputDialog(null, "Which will you use?\n D: DVD Problem:\n C. 2 :Circle Problem");
	choice=value.charAt(0);
	
	if (choice=='D' || choice=='d'){
		value=JOptionPane.showInputDialog(null, "Enter Price for DVD:");
		P=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Total Price is "+ (P * 0.085));
	}
	
	else if (choice=='C' || choice=='c'){
		value=JOptionPane.showInputDialog(null, "Enter a number for radius:");
		R=Double.parseDouble(value);
		JOptionPane.showMessageDialog (null,"Radius for Area is "+ (3.14 * R * R));
		JOptionPane.showMessageDialog (null,"Radius for Circumference"+ (2 * 3.14 * R));
	}
	
	System.exit(0);
	}
}