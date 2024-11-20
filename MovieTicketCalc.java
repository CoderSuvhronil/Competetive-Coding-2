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
        int category = Integer.parseInt(movieCategory);
        if (!circle.equalsIgnoreCase("gold") && !circle.equalsIgnoreCase("silver"))
        {
            if (category != 20 && category != 30)
            {
                return 3; // Both invalid
            }
            return 2; // Circle invalid
        }
        if (category != 20 && category != 30)
        {
            return 1; // Category invalid
        }

        // Calculate ticket cost
        if (circle.equalsIgnoreCase("gold"))
        {
            if (category == 20)
            {
                ticketCost = 300;
            }
            else if (category == 30)
            {
                ticketCost = 500;
            }
        }
        else if (circle.equalsIgnoreCase("silver"))
        {
            if (category == 20)
            {
                ticketCost = 250;
            }
            else if (category == 30)
            {
                ticketCost = 450;
            }
        }
        return 0;
    }
}

// Main class
class MovieTicketCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Get movie details
        Movie movie = getMovieDetails(sc);

        // Get circle
        String circle = getCircle(sc);

        // Calculate ticket cost
        int result = movie.calculateTicketCost(circle);

        // Output results
        System.out.println("Movie name: " + movie.getMovieName());
        System.out.println("Movie category: " + movie.getMovieCategory());

        switch (result)
        {
            case 0:
                System.out.println("The ticket cost is: " + movie.getTicketCost());
                break;
            case 1:
                System.out.println("Sorry, there is no " + movie.getMovieCategory() + " type of category in the theater.");
                break;
            case 2:
                System.out.println("Sorry! Circle is Invalid.");
                break;
            case 3:
                System.out.println("Sorry! Both circle and category are Invalid.");
                break;
        }
    }

    // Method to get movie details
    public static Movie getMovieDetails(Scanner sc)
    {
        Movie movie = new Movie();

        System.out.print("Enter the movie name: ");
        movie.setMovieName(sc.nextLine());

        System.out.print("Enter the movie category: ");
        movie.setMovieCategory(sc.nextLine());

        return movie;
    }

    // Method to get circle
    public static String getCircle(Scanner sc)
    {
        System.out.print("Enter the circle: ");
        return sc.nextLine();
    }
}
