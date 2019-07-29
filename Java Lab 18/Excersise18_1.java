import javax.swing.*;
	public class Excersise18_1{
	public static void main(String[] args){

 	String value;
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Circle Problem \n Enter 2: Rectangle Problem \n 3: Exit");
	if (value.equals("1")) Circle_Problem();
	if (value.equals("2")) Rectangle_Problem();
	else if(!value.equals("3")){
	JOptionPane.showMessageDialog (null,"ILLEGAL ENTRY");
}
	}while(!value.equals("3"));
}



	
	static void Circle_Problem(){

		String value;
		char ansvalue='Y';
		do{
		value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Area Calculation\n Enter 2: Circumference Calculation \n 3: Both\n 4: Exit ");


		if (value.equals("1")){
		do{
		double R; /*Radius*/
		Circle inc=new Circle(); /*Class name*/
		value=JOptionPane.showInputDialog(null, "Enter a number for radius:");
		R=Double.parseDouble(value);
		inc.setRadius(R);
		JOptionPane.showMessageDialog (null,"Radius for Area is "+ inc.calcArea());
		
	
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
		ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
}

	
	

		else if (value.equals("2")){
		do{
		  double R; /*Radius*/
			Circle inc=new Circle(); /*Class name*/
			value=JOptionPane.showInputDialog(null, "Enter a number for radius:");
			R=Double.parseDouble(value);
			inc.setRadius(R);
			JOptionPane.showMessageDialog (null,"Radius for Circumference"+ inc.calcCircum());
			value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
			ansvalue=value.charAt(0);
			
		}while(ansvalue=='y' || ansvalue=='Y');
	}

	

		else if (value.equals("3")){
		do{
			double R; /*Radius*/
			Circle inc=new Circle(); /*Class name*/
			value=JOptionPane.showInputDialog(null, "Enter a number for radius:");
			R=Double.parseDouble(value);
			inc.setRadius(R);
			JOptionPane.showMessageDialog (null,"Radius for Area is "+ inc.calcArea());
			JOptionPane.showMessageDialog (null,"Radius for Circumference"+ inc.calcCircum());
			value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
			ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
}
else if(!value.equals("4")){
	JOptionPane.showMessageDialog (null,"ILLEGAL ENTRY");
}

		}while(!value.equals("4"));
	}




	static void Rectangle_Problem(){
		
		double A, P, W, L; /*Area, Perimeter, Width, Length*/
		String value;
		char ansvalue='Y';
	do{
		value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Area Calculation\n Enter 2: Perimeter Calculation \n 3: Both\n 4: Exit ");

		if (value.equals("1")){
		do{
		Rectangle inc=new Rectangle(); /*Class name*/
		value=JOptionPane.showInputDialog(null, "Enter Length Value:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width Value:");
		W=Double.parseDouble(value);
		inc.setLength(L);
		inc.setWidth(W);
		JOptionPane.showMessageDialog(null, "The Area is: " + inc.calcArea());
		
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
		ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
}

	
		else if (value.equals("2")){
		do{
		Rectangle inc=new Rectangle(); /*Class name*/
		value=JOptionPane.showInputDialog(null, "Enter Length Value:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width Value:");
		W=Double.parseDouble(value);
		inc.setLength(L);
		inc.setWidth(W);
		JOptionPane.showMessageDialog(null, "The Perimeter is: " + inc.calcPerimeter());
		
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
		ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
}


	else if (value.equals("3")){
	do{
		Rectangle inc=new Rectangle(); /*Class name*/
		value=JOptionPane.showInputDialog(null, "Enter Length Value:");
		L=Double.parseDouble(value);
		value=JOptionPane.showInputDialog(null, "Enter Width Value:");
		W=Double.parseDouble(value);
		inc.setLength(L);
		inc.setWidth(W);
		JOptionPane.showMessageDialog(null, "The Area is: " + inc.calcArea());
		JOptionPane.showMessageDialog(null, "The Perimeter is: " + inc.calcPerimeter());
	
	
	value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
	ansvalue=value.charAt(0);
		
	}while(ansvalue=='y' || ansvalue=='Y');
}
else if(!value.equals("4")){
	JOptionPane.showMessageDialog (null,"ILLEGAL ENTRY");
}
	}while(!value.equals("4"));
	}
}

		
		
	class Circle{
	private double radius;
	public Circle(){radius=0;}
	public Circle(double r){radius=r;}
	public void setRadius(double r){radius=r;}
	public double getRadius(){return radius;}
	public double calcArea(){return (radius*radius*3.14);}
	public double calcCircum(){return (2*radius*3.14);}
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

