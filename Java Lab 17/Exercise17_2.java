import javax.swing.*;
class Exercise17_2{
	public static void main(String[] args){
	
	double A, P, W, L; /*Area, Perimeter, Width, Length*/
	String value;
	Rectangle inc=new Rectangle();
	value=JOptionPane.showInputDialog(null, "Enter Length Value:");
	L=Double.parseDouble(value);
	value=JOptionPane.showInputDialog(null, "Enter Width Value:");
	W=Double.parseDouble(value);
	inc.setLength(L);
	inc.setWidth(W);
	JOptionPane.showMessageDialog(null, "The Area is: " + inc.calcArea());
	JOptionPane.showMessageDialog(null, "The Perimeter is: " + inc.calcPerimeter());
	}
}
	

class Rectangle{
	private double length,width;
	public void setLength(double L){length=L;}
   public void setWidth(double W){width=W;}
	public double getWidth(){return width;}
	public double getLength(){return length;}
	public double calcArea(){return (length*width);}
	public double calcPerimeter(){return (2*length+2*width);}
}