import java.util.Scanner;

class MakeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        // Check for invalid array size
        if (size <= 0)
        {
            System.out.println("Invalid array size");
            return;
        }

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        // Create a number from single-digit even numbers
        StringBuilder result = new StringBuilder();
        for (int num : array)
        {
            if (num >= 0 && num <= 9 && num % 2 == 0)
            { // Check for single-digit even numbers
                result.append(num);
            }
        }

        // Output the result
        if (result.length() == 0)
        {
            System.out.println("Single digit even number is not found in the array");
        }
        else
        {
            System.out.println(result.toString());
        }

        sc.close();
    }
}