import java.util.Stack;

/** 
 * This class allows contains the method that checks to see whether a string is a palindrome or not
 * @author brentreynolds
 * @version 9/27/22 Fall 2022
 */
public class PalindromeStack {
	

	/**
	 * No argument constructor creates a new stack of character type
	 */
	public PalindromeStack() {
		Stack<Character> stack = new Stack<Character>();
	}
	
	/**
	 * This method returns true if the entered string is a palindrome, and false otherwise
	 * @param userInput the value of userInput based on the calling method
	 * @return  true if the string is a palindrome, false if it is not a palindrome
	 */
	public boolean isPalindrome(String userInput) {
		Stack<Character> stack = new Stack<Character>();
		for(Character i : userInput.toCharArray()) {
			stack.push(i);
		}
		
		for(int i = 0; i < stack.size(); i++) {
			char c = stack.pop();
			if(userInput.charAt(i) != c) {
				return false;
			}
		}
		return true;
	}
}
