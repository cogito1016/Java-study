/*The Basic_IO made by cogito1016*/

package Adaptation;
import java.util.Scanner;

class Basic_Controlstatement {

	//Conditional statement
	//First, If-else construction 
	/*The type is  if (conditional expression)
	               {sentence1;}
				   else
				   {sentence2;}
	*/
	private int grade;
	Scanner input = new Scanner(System.in);
	
	Basic_Controlstatement() {
		this.in_num();
	}
	   
	private void in_num() {
		System.out.print("Input your grade");
		grade = input.nextInt();
		/**/
		//This is example of conditional construction.
		if(grade>=60)
		{System.out.println("you possible to receive money");}
		else
		{System.out.println("you impossible to receive money");}
	}	
	

}
