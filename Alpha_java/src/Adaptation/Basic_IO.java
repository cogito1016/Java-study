/*The Basic_IO made by cogito1016*/

package Adaptation; //package name
import java.util.Scanner; //import Scanner class in util package in java package


/*
class name

Why Access control is not exist ?
The reason is that i want to implement this class in only this package.
*/
class Basic_IO {
	// TODO Auto-generated method stub
	
	
	
	//'Number' is a varibable to store input of user.
	private int number;
	
	// Make a Scanner type variable 'input'
	//Initialized variable 'input' by making scanner typed new object.
	Scanner input = new Scanner(System.in);
	
	
	Basic_IO() {
		this.in_num();
		this.out_num();
	}
	
	private void in_num() {
		//Output the message to receive user input
		System.out.println("Input number");
		//1.'input' is a variable typed Scanner class.
		//2.nextInt is a method in Scanner class
		//Therefore input called method nextInt to get user input.
		number = input.nextInt();
	}
	
	private void out_num() {
		//Output result.
		System.out.println("Number is "+number);
	}
 
}