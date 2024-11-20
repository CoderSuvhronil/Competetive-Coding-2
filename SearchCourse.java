import java.util.Scanner;

class SearchCourse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the number of courses
        System.out.print("Enter no of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate the input range
        if (numCourses <= 0)
        {
            System.out.println("Invalid Range");
            return;
        }

        // Array to store course names
        String[] courses = new String[numCourses];

        // Input course names
        System.out.println("Enter course names:");
        for (int i = 0; i < numCourses; i++)
        {
            courses[i] = scanner.nextLine();
        }

        // Input the course to be searched
        System.out.print("Enter the course to be searched: ");
        String searchCourse = scanner.nextLine();

        // Search for the course
        boolean found = false;
        for (String course : courses)
        {
            if (course.equalsIgnoreCase(searchCourse))
            {
                found = true;
                break;
            }
        }

        // Display the result
        if (found)
        {
            System.out.println(searchCourse + " course is available");
        }
        else
        {
            System.out.println(searchCourse + " course is not available");
        }

        scanner.close();
    }
}