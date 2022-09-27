import java.util.Scanner;

/**
 * This class allows the user to test whether or not a string is a planidrome
 * @author brentreynolds
 * @version 9/27/22 Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine().toLowerCase().replaceAll("\\s", "").replaceAll("\\p{IsPunctuation}", "");
		
		PalindromeStack stack = new PalindromeStack();
		
		System.out.println(stack.isPalindrome(userInput));

	}

}
