import java.util.Scanner;

class NameCharacterCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the name
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Check if the input contains only alphabets and spaces
        if (!name.matches("[a-zA-Z ]+"))
        {
            System.out.println("Invalid input");
            return;
        }

        // Remove spaces and count characters
        int characterCount = name.replace(" ", "").length();

        // Display the result
        System.out.println(name + " has " + characterCount + " characters");
    }
}