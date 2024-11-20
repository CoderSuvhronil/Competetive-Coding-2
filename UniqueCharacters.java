import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

class UniqueCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        // Validate the sentence
        if (!sentence.matches("[a-zA-Z ]+"))
        {
            System.out.println("Invalid Sentence");
            return;
        }

        // Remove spaces and convert to lowercase
        String sanitizedSentence = sentence.replaceAll(" ", "").toLowerCase();

        // Count occurrences of each character
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : sanitizedSentence.toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Identify unique characters
        StringBuilder uniqueChars = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            if (entry.getValue() == 1)
            {
                uniqueChars.append(entry.getKey()).append("\n");
            }
        }

        // Print result
        if (uniqueChars.length() == 0)
        {
            System.out.println("No unique characters");
        }
        else
        {
            System.out.println("Unique characters:");
            System.out.print(uniqueChars.toString());
        }

        sc.close();
    }
}