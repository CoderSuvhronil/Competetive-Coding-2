import java.util.Scanner;

// Movie class
class Movie
{
    private String movieName;
    private String movieCategory;
    private int ticketCost;

    // Getters and Setters
    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public String getMovieCategory()
    {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory)
    {
        this.movieCategory = movieCategory;
    }

    public int getTicketCost()
    {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost)
    {
        this.ticketCost = ticketCost;
    }

    // Method to calculate ticket cost
    public int calculateTicketCost(String circle)
    {
        if (!(movieCategory.equalsIgnoreCase("2D") || movieCategory.equalsIgnoreCase("3D")))
        {
            if (!(circle.equalsIgnoreCase("Gold") || circle.equalsIgnoreCase("Silver")))
            {
                return -3; // Both invalid
            }
            return -1; // Category invalid
        }
        if (!(circle.equalsIgnoreCase("Gold") || circle.equalsIgnoreCase("Silver")))
        {
            return -2; // Circle invalid
        }

        // Valid cases
        if (circle.equalsIgnoreCase("Gold"))
        {
            if (movieCategory.equalsIgnoreCase("2D"))
            {
                ticketCost = 300;
            }
            else if (movieCategory.equalsIgnoreCase("3D"))
            {
                ticketCost = 500;
            }
        }
        else if (circle.equalsIgnoreCase("Silver"))
        {
            if (movieCategory.equalsIgnoreCase("2D"))
            {
                ticketCost = 250;
            }
            else if (movieCategory.equalsIgnoreCase("3D"))
            {
                ticketCost = 450;
            }
        }
        return 0; // Success
    }
}

// Main class
class MovieTicketCalc
{
    // Method to get movie details
    public static Movie getMovieDetails()
    {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.print("Enter Movie Name: ");
        movie.setMovieName(scanner.nextLine());

        System.out.print("Enter Movie Category (2D/3D): ");
        movie.setMovieCategory(scanner.nextLine());

        return movie;
    }

    // Method to get circle
    public static String getCircle()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Circle (Gold/Silver): ");
        return scanner.nextLine();
    }

    // Main method
    public static void main(String[] args)
    {
        Movie movie = getMovieDetails();
        String circle = getCircle();

        int result = movie.calculateTicketCost(circle);
        movie.setTicketCost(movie.getTicketCost());

        switch (result)
        {
            case 0:
                System.out.println("The ticket cost is: " + movie.getTicketCost());
                break;
            case -1:
                System.out.println("Invalid movie category");
                break;
            case -2:
                System.out.println("Invalid circle");
                break;
            case -3:
                System.out.println("Both movie category and circle are invalid");
                break;
        }
    }
}
