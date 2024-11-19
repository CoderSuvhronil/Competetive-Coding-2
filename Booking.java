import java.util.Scanner;

// Ticket class
class Ticket {
    private int ticketId;
    private int price;
    private static int availableTickets;

    // Getters and setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0) {
            Ticket.availableTickets = availableTickets;
        } else {
            System.out.println("Available tickets should be a positive number.");
        }
    }

    // Method to calculate ticket cost
    public int calculateTicketCost(int noOfTickets) {
        if (noOfTickets <= availableTickets) {
            availableTickets -= noOfTickets; // Reduce the number of available tickets
            return noOfTickets * price; // Calculate total cost
        } else {
            return -1; // Not enough tickets
        }
    }
}

// Main class
public class Booking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of bookings
        System.out.print("Enter no of bookings: ");
        int bookings = scanner.nextInt();

        // Get the available tickets
        System.out.print("Enter the available tickets: ");
        Ticket.setAvailableTickets(scanner.nextInt());

        for (int i = 0; i < bookings; i++) {
            System.out.println("\nBooking " + (i + 1));

            // Create a Ticket object
            Ticket ticket = new Ticket();

            // Get ticket details
            System.out.print("Enter the ticket id: ");
            ticket.setTicketId(scanner.nextInt());

            System.out.print("Enter the price: ");
            ticket.setPrice(scanner.nextInt());

            // Get the number of tickets to book
            System.out.print("Enter the no of tickets: ");
            int noOfTickets = scanner.nextInt();

            // Calculate and display the ticket cost
            int totalCost = ticket.calculateTicketCost(noOfTickets);
            if (totalCost == -1) {
                System.out.println("Tickets not sufficient / available.");
            } else {
                System.out.println("Total amount: " + totalCost);
                System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
            }
        }

        scanner.close();
    }
}
