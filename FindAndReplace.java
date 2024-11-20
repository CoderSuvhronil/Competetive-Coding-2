import java.util.Scanner;

class FindAndReplace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String inputString = sc.nextLine();

        // Input the character to be searched
        System.out.println("Enter the character to be searched:");
        char charToSearch = sc.next().charAt(0);

        // Input the replacement character
        System.out.println("Enter the character to replace:");
        char charToReplace = sc.next().charAt(0);

        // Find and replace the first occurrence
        int index = inputString.indexOf(charToSearch);

        if (index == -1)
        {
            System.out.println("Character not found");
        }
        else
        {
            String result = inputString.substring(0, index) + charToReplace + inputString.substring(index + 1);
            System.out.println(result);
        }

        sc.close();
    }
}