import javax.swing.*;
public class FeetToInches3{
   
   public static void main(String args[]){
   
   String value;
	double feet;
   	
	value=JOptionPane.showInputDialog(null, "Enter amount of Feet:");
   
	feet = Double.parseDouble(value);
   
   double inches = feet * 12;

   
   JOptionPane.showMessageDialog(null, inches + "Inches");
   }
}
   