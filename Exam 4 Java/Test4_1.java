import javax.swing.*;
	public class Test4_1
	{
	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Factorial Value :\n Enter 2: Exit:");
	if (value.equals("1")) Factorial_Value();
	}while(!value.equals("2"));
}
	
	static void Factorial_Value(){
	
	String value;
	int I, X;
	int F=1;
	
	value=JOptionPane.showInputDialog(null, "Enter Integer Value");
	X=Integer.parseInt(value);
	for (I = 1; I <= X; I++)
	F = F * I;
	JOptionPane.showMessageDialog(null, "Factorial of : " + F);
	}
}
