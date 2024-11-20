import java.util.Scanner;

class CharacterOccurrence
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the word
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // Check if the word is valid (only alphabets and no spaces or special characters)
        if (!word.matches("[a-zA-Z]+"))
        {
            System.out.println("Invalid word. The word should contain only alphabets.");
            return;
        }

        // Input the character
        System.out.println("Enter the character:");
        char character = sc.next().charAt(0);

        // Check if the character is valid (only one alphabet character)
        if (!Character.isAlphabetic(character))
        {
            System.out.println("Invalid character. Please enter an alphabet.");
            return;
        }

        // Count occurrences of the character in the word
        int count = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == character)
            {
                count++;
            }
        }

        // Display the result
        System.out.println("No of '" + character + "' present in the given word is " + count + ".");
    }
}