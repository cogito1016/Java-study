/*The Basic_Controlstatement made by cogito1016*/

package Adaptation;
import java.util.Scanner;

class Basic_Controlstatement {

	//Conditional statement
	//First, If-else statement
	/*The type is  if (conditional expression)
	               {sentence1;}
				   else
				   {sentence2;}
	*/
	private int num=0;
	private int grade;
	Scanner input = new Scanner(System.in);
	
	//this is Constructor in this class
	Basic_Controlstatement() {
		this.in_num_SW();
	}
	
	//Conditional statement SWITCH 
	private void in_num_SW() {
		while(true)
		{
			System.out.print("Choice the topic (1:IF-ELSE 2:WHILE 3:FOR 4:BREAK)");
			num = input.nextInt();
			if(num==4)
				break;
			//THis is SWITCH
			switch(num)
			{
			case 1:
				this.in_num_IF();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}
	}	
	
	   
	//Conditional statement IF_ELSE
	private void in_num_IF() {
		System.out.print("Input your grade");
		grade = input.nextInt();
		//This is IF-ELSE
		if(grade>=60)
		{System.out.println("you possible to receive money");}
		else
		{System.out.println("you impossible to receive money");}
	}	
	


}
