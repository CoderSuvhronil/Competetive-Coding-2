import java.util.Scanner;

class HighestMark
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter 5 marks:");

        // Reading 5 marks
        for (int i = 0; i < 5; i++)
        {
            marks[i] = scanner.nextInt();
        }

        // Finding the highest mark
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++)
        {
            if (marks[i] > highest)
            {
                highest = marks[i];
            }
        }

        // Display the highest mark
        System.out.println("Highest mark is " + highest);
        scanner.close();
    }
}