/*The Basic_IO made by cogito1016*/

package Adaptation; //package name
import java.util.Scanner; //import Scanner class in util package in java package


//class name
public class Basic_IO {
	//main method, parameter is string type 'args'
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//'Number' is a varibable to store input of user.
		int number;
		
		// Make a Scanner type variable 'input'
		//Initialized variable 'input' by making scanner typed new object.
		Scanner input = new Scanner(System.in);
		
		//Output the message to receive user input
		System.out.println("Input number");
		//1.'input' is a variable typed Scanner class.
		//2.nextInt is a method in Scanner class
		//Therefore input called method nextInt to get user input.
		number = input.nextInt();
		
		//Output result.
		System.out.print("Number is "+number);
		
	}
 
}