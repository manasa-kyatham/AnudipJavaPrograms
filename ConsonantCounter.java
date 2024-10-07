import java.util.Scanner;

public class ConsonantCounter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // user enters a sentence through keyboard
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); 
        // Convert to lower case for easy comparison

        int consonantCount = 0;
        for (int i = 0; i < sentence.length(); i++)
        {
            char c = sentence.charAt(i);
            if (Character.isLetter(c))
            { 
            	// Check character 'c' not a vowel 
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                {
                    consonantCount++;
                }
            }
        }
        // printing no.of consonants present in the sentence
        System.out.println("Number of consonants in the sentence: " + consonantCount);
    }
}
