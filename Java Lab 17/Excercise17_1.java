import javax.swing.*;
public class Excercise17_1{
public static void main(String[] args){

	int N;
	String value;
	Increment inc=new Increment(); /*Class name*/
	value=JOptionPane.showInputDialog(null, "Enter number");
	N=Integer.parseInt(value);
	inc.setValue(N);
	JOptionPane.showMessageDialog(null, "The Increment for the number is: " + inc.calcIncrement());
	}
}

class Increment
{
	private int value;
	public void setValue(int N){value=N;}
	public int getValue(){return value;}
	public int calcIncrement(){return (value+1);}	
} 
	
	
