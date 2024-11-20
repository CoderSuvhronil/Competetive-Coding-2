import java.util.Scanner;

class Shop 
{
    private String shopName;
    private String shopAddress;
    private String[] products;

    // Constructor to initialize the attributes
    public Shop(String shopName, String shopAddress, String[] products) 
    {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = products;
    }

    // Method to check product availability
    public boolean checkProductAvailability(String productName) 
    {
        for (String product : products) 
        {
            if (product.equalsIgnoreCase(productName)) 
            {
                return true;
            }
        }
        return false;
    }
}

class RetailShop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input shop details
        System.out.println("Enter the shop name:");
        String shopName = sc.nextLine();

        System.out.println("Enter the shop address:");
        String shopAddress = sc.nextLine();

        // Input number of products
        System.out.println("Enter number of products:");
        int numProducts = sc.nextInt();
        sc.nextLine(); // Consume the newline

        if (numProducts <= 0) 
        {
            System.out.println("Number of products should be greater than zero.");
            return;
        }

        // Input product names
        String[] products = new String[numProducts];
        System.out.println("Enter the product names:");
        for (int i = 0; i < numProducts; i++) 
        {
            products[i] = sc.nextLine();
        }

        // Create a Shop object
        Shop shop = new Shop(shopName, shopAddress, products);

        // Input product to search
        System.out.println("Enter the product to be searched:");
        String productToSearch = sc.nextLine();

        // Check product availability
        boolean isAvailable = shop.checkProductAvailability(productToSearch);
        if (isAvailable) 
        {
            System.out.println("Product is available in the shop.");
        } 
        else 
        {
            System.out.println("Product is not available in the shop.");
        }
    }
}