import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ask the user to enter a sentence
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine().toLowerCase();
		// Convert to lowercase for easier comparison

		int vowelCount = 0;
		for (char c : sentence.toCharArray()) {
			// Check if the character is a vowel
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				vowelCount++;
			}
		}

		System.out.println("Number of vowel characters in the sentence: " + vowelCount);

	}
}
