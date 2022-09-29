import java.util.Scanner;

/**
 * This class allows the user to test whether or not a string is a palindrome
 * @author brentreynolds
 * @version 9/27/22 Fall 2022
 */
public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = input.nextLine().toLowerCase().replaceAll("\\s", "").replaceAll("\\p{IsPunctuation}", "");
		
		PalindromeStack stack = new PalindromeStack();
		
		System.out.println("Is the string, "+ userInput + ", a palindrome: " + stack.isPalindrome(userInput));
		
		String testString1 = "racecar";
		System.out.println("Is the string, " + testString1 + ", a palindrome: " + stack.isPalindrome(testString1));
		
		
		String testString3 = "Brent";
		System.out.println("Is the string, " + testString3 + ", a palindrome: " + stack.isPalindrome(testString3));

	}

}
