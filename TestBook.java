import java.util.Scanner;

// Book class with private member variables
class Book {
    private String bookName;
    private int bookPrice;
    private String authorName;

    // Getters and Setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

// TestBook class with the main method
class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an object of the Book class
        Book book = new Book();

        // Getting user input
        System.out.print("Enter the Book name: ");
        String bookName = scanner.nextLine();
        book.setBookName(bookName);

        System.out.print("Enter the price: ");
        int bookPrice = scanner.nextInt();
        book.setBookPrice(bookPrice);

        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the Author name: ");
        String authorName = scanner.nextLine();
        book.setAuthorName(authorName);

        // Displaying the output
        System.out.println("\nBook Details");
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Book Price: " + book.getBookPrice());
        System.out.println("Author Name: " + book.getAuthorName());

        scanner.close();
    }
}
