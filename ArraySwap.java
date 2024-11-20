import java.util.Scanner;

class ArraySwap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the first array
        System.out.print("Enter the number of elements in the first array: ");
        int size1 = scanner.nextInt();

        if (size1 <= 0)
        {
            System.out.println("Invalid range");
            return;
        }

        int[] array1 = new int[size1];
        System.out.println("Enter the elements in the first array:");
        for (int i = 0; i < size1; i++)
        {
            array1[i] = scanner.nextInt();
        }

        // Input the number of elements in the second array
        System.out.print("Enter the number of elements in the second array: ");
        int size2 = scanner.nextInt();

        if (size2 <= 0)
        {
            System.out.println("Invalid range");
            return;
        }

        int[] array2 = new int[size2];
        System.out.println("Enter the elements in the second array:");
        for (int i = 0; i < size2; i++)
        {
            array2[i] = scanner.nextInt();
        }

        // Check if sizes of arrays differ
        if (size1 != size2)
        {
            System.out.println("Unable to swap size differs");
            return;
        }

        // Swap the elements without using a third array
        for (int i = 0; i < size1; i++)
        {
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }

        // Display the arrays after swapping
        System.out.println("The first array after swapping is:");
        for (int i = 0; i < size1; i++)
        {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nThe second array after swapping is:");
        for (int i = 0; i < size2; i++)
        {
            System.out.print(array2[i] + " ");
        }

        scanner.close();
    }
}