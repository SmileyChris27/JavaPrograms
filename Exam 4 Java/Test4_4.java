import javax.swing.*;
	public class Test4_4
	{
		static int H;			/*Hours*/
	   static int M;			/*Minutes*/
	   static int S;			/*Seconds*/
		static int US=0;		/*User Seconds*/
		static int UM=0;     /*User Minutes*/
		static int UH=0; 		/*User Hours*/
		
		
		static String value;
		
		static char ansvalue='Y';
		

	public static void main(String[] args){
	
	String value;
	
	do{
	value=JOptionPane.showInputDialog(null, "Main Menu\n Enter 1: Increment Seconds :\n Enter 2: Increment Minutes:\n Enter 3: Increment Hour:\n Enter 4: Reset Time:\n Enter 5: Print time in standard form:\n Enter 6: Print time in military form:\n Enter 7: Quit Program:");
	if (value.equals("1")) Increment_Seconds();
	if (value.equals("2")) Increment_Minutes();
	if (value.equals("3")) Increment_Hour();
	if (value.equals("4")) Reset_Time();
	if (value.equals("5")) Print_time_in_standard_form();
	if (value.equals("6")) Print_time_in_military_form();
	}while(!value.equals("7"));
	}


	
	static void Increment_Seconds(){

	   
	
	do{
		value=JOptionPane.showInputDialog(null, "Enter Amount of Seconds:");
		US=Integer.parseInt(value);
		S = S + US;  
		
		JOptionPane.showMessageDialog (null, "Seconds Equals to " + (S%60));
		
		ansvalue=value.charAt(0);
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");


	}while(ansvalue=='y' || ansvalue=='Y');
  }
  
				



	
	static void Increment_Minutes(){
	
	
	do{
		value=JOptionPane.showInputDialog(null, "Enter Amount of Minutes:");
		UM=Integer.parseInt(value);
		S = S + UM * 60;
		JOptionPane.showMessageDialog (null, "Minutes Equals to " + (H/60));
	
		ansvalue=value.charAt(0);
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");

	}while(ansvalue=='y' || ansvalue=='Y');
  }
 
  
  

	static void Increment_Hour(){
	
	do{
		value=JOptionPane.showInputDialog(null, "Enter Amount of Hours:");
		UH=Integer.parseInt(value);
		S = S + UH * 3600;
		JOptionPane.showMessageDialog (null, "Hours Equals to " + (S/3600));
		UH=S%3600;
		
		ansvalue=value.charAt(0);
		value=JOptionPane.showInputDialog("Cotinue(Y/N)?");
	
	}while(ansvalue=='y' || ansvalue=='Y');
  }


	
	
	

	static void Reset_Time(){

	S = 0;
	M = 0;
	H = 0;
	
	JOptionPane.showMessageDialog(null, "Your time has been reset");
}
	

	static void Print_time_in_standard_form(){
	
	
	int hours=S/3600;
	int reminder=S%3600;
	int minutes=reminder/60;
	int seconds=reminder%60;
	
	if (hours>=12){
	JOptionPane.showMessageDialog (null, (hours-12)+":"+minutes+":"+seconds+" (pm)");
	} 
	else{
	JOptionPane.showMessageDialog (null, hours+":"+minutes+":"+seconds+" (am)");
	}
}

	

	static void Print_time_in_military_form(){	
		
		int hours=S/3600;
		int reminder=S%3600;
		int minutes=reminder/60;
		int seconds=reminder%60;
		JOptionPane.showMessageDialog (null, hours+":"+minutes+":"+seconds);
	}
	
	
	

	
	
	
}//end of class//
	
	

	
		
		

	