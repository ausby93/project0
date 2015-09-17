import java.util.Scanner;

/**
 * 
 * @author Corey Ausby
 *
 */

public class ProjectZero {

	public static void main(String[] args) {
		
		public static void main(String[] args) {
		Scanner inputSource = new Scanner(System.in);
		Scanner runAgain = new Scanner(System.in); //reading in another input so the program can run again
		
		
		String answer = null;
	
	do { // do-while loop so the program can be run over and over
		
			System.out.println("Please enter two numbers: ");
			
		double input1  = Double.parseDouble(inputSource.next());
		double input2 = Double.parseDouble(inputSource.next());
		double result = input1 + input2;
			
		 System.out.println("The sum of " + input1 + " and " + input2 + " is " + result);

		    
		    System.out.println("Do you want to run this again? Enter Y for Yes or N for No: ");
		    answer = runAgain.next();
			
		
	} while (!answer.equals("N"));
		
	    inputSource.close();		

	}

}

