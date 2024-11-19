import java.util.Scanner;

// Employee class
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary(int pfPercentage) {
        double pfAmount = (salary * pfPercentage) / 100.0;
        this.netSalary = salary - pfAmount;
    }
}

// Main class
class main {
    public static void main(String[] args) {
        // Get employee details
        Employee employee = getEmployeeDetails();

        // Get PF percentage
        int pfPercentage = getPFPercentage();

        // Calculate net salary
        employee.calculateNetSalary(pfPercentage);

        // Print employee details
        System.out.println("\nEmployee Details");
        System.out.println("Id: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }

    // Method to get employee details
    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        employee.setEmployeeId(id);

        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        employee.setEmployeeName(name);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        return employee;
    }

    // Method to get PF percentage
    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PF percentage: ");
        return scanner.nextInt();
    }
}
