import javax.swing.*;
class Exercise14_3{
  public static void main(String[] args){

  		double R; /*Radius*/
		
		String value;
	 	
		
		
		value=JOptionPane.showInputDialog(null, "Enter radius:");
	 	R=Double.parseDouble(value);
	 	
		JOptionPane.showMessageDialog(null, "Area: " + CalcArea(R));
		JOptionPane.showMessageDialog(null, "Circumference: " + CalcCircumference(R));
  }
  
  static double CalcArea(double R) { return R*R*3.14;  }
  static double CalcCircumference(double R) { return 2*R*3.14;}
}