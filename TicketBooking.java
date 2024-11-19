import java.util.Scanner;

// Person class
class Person
{
    private String name;
    private char gender;
    private int age;

    // Getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

// BusTicket class
class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;

    // Getters and setters
    public int getTicketNo()
    {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo)
    {
        this.ticketNo = ticketNo;
    }

    public float getTicketPrice()
    {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice)
    {
        this.ticketPrice = ticketPrice;
    }

    public float getTotalAmount()
    {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    // Method to calculate total price
    public void calculateTotal()
    {
        float discount = 0.0f;
        int age = person.getAge();
        char gender = person.getGender();

        if (age < 16)
        {
            discount = 0.50f; // 50% discount for children
        }
        else if (age >= 50)
        {
            discount = 0.25f; // 25% discount for senior citizens
        }
        else if (gender == 'F' || gender == 'f')
        {
            discount = 0.10f; // 10% discount for ladies
        }

        totalAmount = ticketPrice - (ticketPrice * discount);
    }
}


class TicketBooking
{
    public static void main(String[] args)
    {
        BusTicket ticket = getTicketDetails();
        ticket.calculateTotal();
        printTicketDetails(ticket);
    }

    // Method to get ticket details
    public static BusTicket getTicketDetails()
    {
        Scanner scanner = new Scanner(System.in);

        // Create Person object
        Person person = new Person();
        System.out.print("Enter the passenger name: ");
        person.setName(scanner.nextLine());
        System.out.print("Enter the gender (M/F): ");
        person.setGender(scanner.next().charAt(0));
        System.out.print("Enter the age: ");
        person.setAge(scanner.nextInt());

        // Create BusTicket object
        BusTicket ticket = new BusTicket();
        System.out.print("Enter the ticket no: ");
        ticket.setTicketNo(scanner.nextInt());
        System.out.print("Enter the ticket price: ");
        ticket.setTicketPrice(scanner.nextFloat());

        ticket.setPerson(person);
        scanner.close();
        return ticket;
    }

    // Method to print ticket details
    public static void printTicketDetails(BusTicket ticket)
    {
        System.out.println("\nTicket No: " + ticket.getTicketNo());
        System.out.println("Passenger Name: " + ticket.getPerson().getName());
        System.out.println("Total Ticket Price: " + ticket.getTotalAmount());
    }
}
