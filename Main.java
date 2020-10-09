import java.util.Scanner;
/**
 * a program that will populate an array with 2 spots in it. 
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  	// create a scanner for user input
    Scanner input = new Scanner(System.in);
		//amount of times the user can input into console
		final int USER_INPUT = 2;
    // create an array with 2 values in it
    int[] userInput = new int[USER_INPUT];

    // out put a messaqge to the user to enter 2 values
    System.out.println("Please enter the 2 values for the array");

    // let the user input 2 values in seperate lines this code loops the array command so thast the user can input twice
    for(int i = 0; i < 2; i++){
      userInput[i] = input.nextInt();
    }
		//An if statements that checks if the index 0 is less than the index 1 then it will print it in asscending order which is index 0 then index 1 
    if(userInput[0] < userInput[1]){
      System.out.println("Your numbers in ascending order are " + userInput[0] + " and " + userInput[1]);
		//else if the index 0 is greater than index 1 then index 1 will be first then index 0
		}else if (userInput[0] > userInput [1]) {
      System.out.println("Your numbers in ascending order are " + userInput[1] + " and " + userInput[0]);
    //if the values are equal to each other then it will oputput a message to the user that the values are equal to each other
		} else {
			System.out.println("Your values are equal to each other");
		}
 	}
}
