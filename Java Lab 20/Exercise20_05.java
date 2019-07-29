import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

	public class Exercise20_05{
	
	public static void main(String[] args) throws IOException{
	
	double [] A=new double[100];
	double [] B=new double[100];
	double [] C=new double[100];
	double [] D=new double[100];
	double [] F=new double[100];
	
	int a=0,b=0,c=0,d=0,f=0,count=0;
	double sum=0;
	double low=1000, high=-1;
	
	
	File grade1=new File("grades.txt");		
	Scanner input=new Scanner(grade1);
	
	while(input.hasNext())
	{
		double grade=input.nextDouble();
		if (grade>=90)     A[a++]=grade;
		else if(grade>=80) B[b++]=grade;
		else if(grade>=70) C[c++]=grade;
      else if(grade>=60) D[d++]=grade;
		else  F[f++]=grade;
		sum=sum+grade;
		count++;
		if (low>grade) low=grade;
		if (high<grade) high=grade;
	}
	
	
	String listA="";
	String listB="";
	String listC="";
	String listD="";
	String listF="";

	for(int i=0;i<a;i++) listA=listA+A[i]+" ";
	JOptionPane.showMessageDialog(null, "A :" + listA );
	for(int i=0;i<b;i++) listB=listB+B[i]+" ";
	JOptionPane.showMessageDialog(null, "B :" + listB );
	for(int i=0;i<c;i++)	listC=listC+C[i]+" ";
	JOptionPane.showMessageDialog(null, "C :" + listC );
	for(int i=0;i<d;i++) listD=listD+D[i]+" ";
	JOptionPane.showMessageDialog(null, "D :" + listD );
	for(int i=0;i<f;i++) listF=listF+F[i]+" ";
	JOptionPane.showMessageDialog(null, "F :" + listF );
	
	
	JOptionPane.showMessageDialog(null, "Display Lowest Grade : " + high);
	JOptionPane.showMessageDialog(null, "Display Highest Grade : " + low);
	JOptionPane.showMessageDialog(null, "Display Average Grade : " + sum/count);
   
	}//end of main
	}//end of class


	
	