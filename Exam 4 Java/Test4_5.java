import javax.swing.*;
public class Test4_5{
public static void main(String[] args){

	

		int N, D; /*Numerator, Denominator*/
		
		String value;
		
		value=JOptionPane.showInputDialog(null, "Enter Numerator:");
		N=Integer.parseInt(value);
		
		value=JOptionPane.showInputDialog(null, "Enter Denominator:");
		D=Integer.parseInt(value);


		
		
		for(int a=1;a<=N;a++){
		if(N%a==0 &&D%a==0){

		N/=a;
		D/=a;
		a=1;
		}
	}
	
	JOptionPane.showMessageDialog(null, N+"/"+D);
	}
}

