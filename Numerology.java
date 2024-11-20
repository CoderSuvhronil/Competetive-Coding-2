import java.util.Scanner;

class Numerology 
{

    public static void main(String[] args) 
    {
        // Define the numerological values for each letter A-Z
        String[] numerology = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "1", "2", "3", "4", "5", "6", "7", "8", "9", "1", "2", "3", "4", "5", "6", "7", "8"
        };

        // Input the name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Check if the name is in uppercase and contains no spaces
        if (!name.matches("[A-Z]+")) 
        {
            System.out.println("Invalid name. There should not be any space in the name provided.");
            return;
        }

        // Initialize the numerological sum
        int numerologySum = 0;

        // Calculate the numerological sum by converting each letter
        for (int i = 0; i < name.length(); i++) 
        {
            char letter = name.charAt(i);
            int index = letter - 'A';  // Get the index of the character (A=0, B=1, ..., Z=25)
            numerologySum += Integer.parseInt(numerology[index]);
        }

        // Output the numerological value
        System.out.println("Your numerology number is: " + numerologySum);
    }
}