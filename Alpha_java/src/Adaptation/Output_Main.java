/*The Output_Main made by cogito1016*/
//Main

package Adaptation;

import java.io.IOException;
import java.util.Scanner;

public class Output_Main {

	//main method, parameter is string type 'args'
	public static void main(String[] args) throws IOException {
		
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("::Choice the subject::");
		System.out.println("1:ControlStatement 2:BasicIO 3:Map 4:WordCount 5:ReportCompare 6:NetworkBasic");
		int innum = scann.nextInt();
		
		switch(innum)
		{
		case 1:
			Basic_Controlstatement Example2 = new Basic_Controlstatement();
			break;
		case 2:
			Basic_IO Example1 = new Basic_IO();
			break;
		case 3:
			Employee_Map Example3 = new Employee_Map();
			break;
		case 4:
			word_count Example4 = new word_count();
			break;
		case 5:
			Report_Compare Example5 = new Report_Compare();
			break;
		case 6:
			Network_Basic Example6 = new Network_Basic();
			break;
			
		}
		
		
		
		 
	}

	
}
  