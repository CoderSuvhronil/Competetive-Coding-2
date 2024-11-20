import java.util.Scanner;

class Department 
{
    private int deptid;
    private String deptname;

    public int getDeptid() 
    {
        return deptid;
    }

    public void setDeptid(int deptid) 
    {
        this.deptid = deptid;
    }

    public String getDeptname() 
    {
        return deptname;
    }

    public void setDeptname(String deptname) 
    {
        this.deptname = deptname;
    }
}

class Student 
{
    private int studentid;
    private String studentname;
    private Department dept;

    public int getStudentid() 
    {
        return studentid;
    }

    public void setStudentid(int studentid) 
    {
        this.studentid = studentid;
    }

    public String getStudentname() 
    {
        return studentname;
    }

    public void setStudentname(String studentname) 
    {
        this.studentname = studentname;
    }

    public Department getDept() 
    {
        return dept;
    }

    public void setDept(Department dept) 
    {
        this.dept = dept;
    }
}

class StudentDeptDetail 
{
    public static Student createStudent()
    {
        Scanner sc = new Scanner(System.in);

        // Create Department
        Department dept = new Department();
        System.out.print("Enter the Department id: ");
        dept.setDeptid(sc.nextInt());
        sc.nextLine(); // Consume newline
        System.out.print("Enter the Department name: ");
        dept.setDeptname(sc.nextLine());

        // Create Student
        Student student = new Student();
        System.out.print("Enter the Student id: ");
        student.setStudentid(sc.nextInt());
        sc.nextLine(); // Consume newline
        System.out.print("Enter the Student name: ");
        student.setStudentname(sc.nextLine());

        student.setDept(dept); // Associate student with department

        return student;
    }

    public static void main(String[] args)
    {
        Student student = createStudent();

        // Display Student and Department Details
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Student Name: " + student.getStudentname());
        System.out.println("Department ID: " + student.getDept().getDeptid());
        System.out.println("Department Name: " + student.getDept().getDeptname());
    }
}