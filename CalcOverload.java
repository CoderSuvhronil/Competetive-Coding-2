import java.util.Scanner;

class VolumeCalculator
{
    double calculateVolume(double radius, double height)
    {
        return 3.14 * radius * radius * height;
    }

    // Method to calculate the volume of a cuboid
    double calculateVolume(int length, int breadth, int height)
    {
        return length * breadth * height;
    }
}

class CalcOverload
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        VolumeCalculator volumeCalculator = new VolumeCalculator();

        // Menu to select the shape
        System.out.println("Enter the choice");
        System.out.println("4. Find Volume For Cylinder");
        System.out.println("2. Find Volume For Cuboid");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1: // Cylinder
                System.out.println("Enter the radius");
                double radius = scanner.nextDouble();
                System.out.println("Enter the height");
                double height = scanner.nextDouble();
                double cylinderVolume = volumeCalculator.calculateVolume(radius, height);
                System.out.printf("Volume of the Cylinder is %.2f\n", cylinderVolume);
                break;

            case 2: // Cuboid
                System.out.println("Enter the length");
                int length = scanner.nextInt();
                System.out.println("Enter the breadth");
                int breadth = scanner.nextInt();
                System.out.println("Enter the height");
                int cuboidHeight = scanner.nextInt();
                double cuboidVolume = volumeCalculator.calculateVolume(length, breadth, cuboidHeight);
                System.out.printf("Volume of the Cuboid is %.2f\n", cuboidVolume);
                break;

            default:
                System.out.println("Invalid choice. Please select either 4 or 2.");
                break;
        }

        scanner.close();
    }
}