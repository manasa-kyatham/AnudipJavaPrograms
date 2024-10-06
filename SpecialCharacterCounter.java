import java.util.Scanner;

public class SpecialCharacterCounter {
	public static void main(String[] args) {
		// creating scanner class
		Scanner scanner = new Scanner(System.in);

		// user enter a sentence
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();

		int specialCharacterCount = 0;
		for (char c : sentence.toCharArray())
		{
			// check if the character is a special character
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) 
			{
				specialCharacterCount++;

			}

		}
		System.out.println("Number of special characters in the sentence: " + specialCharacterCount);
	}

}
