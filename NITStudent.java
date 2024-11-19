import java.util.Scanner;

// Student class
class Student 
{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // Constructor for NIT students
    public Student(int studentId, String studentName, String studentAddress) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT"; // Default college name
    }

    // Constructor for students from other colleges
    public Student(int studentId, String studentName, String studentAddress, String collegeName) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // Getters
    public int getStudentId() 
    {
        return studentId;
    }

    public String getStudentName() 
    {
        return studentName;
    }

    public String getStudentAddress() 
    {
        return studentAddress;
    }

    public String getCollegeName() 
    {
        return collegeName;
    }
}

class NITStudent
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Student student = null;

        System.out.print("Enter the student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the student address: ");
        String studentAddress = scanner.nextLine();

        while (true) 
        {
            System.out.print("Is the student from NIT (yes/YES or no/NO)? ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) 
            {
                // Create student object for NIT
                student = new Student(studentId, studentName, studentAddress);
                break;
            } 
            else if (response.equalsIgnoreCase("no")) 
            {
                System.out.print("Enter the college name: ");
                String collegeName = scanner.nextLine();
                // Create student object for non-NIT college
                student = new Student(studentId, studentName, studentAddress, collegeName);
                break;
            } 
            else 
            {
                System.out.println("Wrong Input. Please enter yes/YES or no/NO.");
            }
        }

        scanner.close();

        // Display student details
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
    }
}