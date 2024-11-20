import java.util.Scanner;

// Account class
class Account
{
    private int accountId;
    private String accountType;
    private int balance;

    // Getters and Setters
    public int getAccountId()
    {
        return accountId;
    }

    public void setAccountId(int accountId)
    {
        this.accountId = accountId;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    // Method to withdraw amount
    public boolean withdraw(int amount)
    {
        if (amount > balance)
        {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else
        {
            balance -= amount;
            System.out.println("Balance amount after withdraw: " + balance);
            return true;
        }
    }
}

// AccountDetails class
class BankAccountDetails
{
    // Method to get account details
    public Account getAccountDetails()
    {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter Account ID: ");
        account.setAccountId(scanner.nextInt());

        System.out.print("Enter Account Type: ");
        account.setAccountType(scanner.next());

        int balance;
        do {
            System.out.print("Enter Balance: ");
            balance = scanner.nextInt();
            if (balance <= 0)
            {
                System.out.println("Balance should be positive");
            }
        } while (balance <= 0);
        account.setBalance(balance);

        return account;
    }

    // Method to get withdraw amount
    public int getWithdrawAmount()
    {
        Scanner scanner = new Scanner(System.in);
        int amount;
        do {
            System.out.print("Enter amount to withdraw: ");
            amount = scanner.nextInt();
            if (amount <= 0)
            {
                System.out.println("Amount should be positive");
            }
        } while (amount <= 0);
        return amount;
    }

    // Main method
    public static void main(String[] args)
    {
        AccountDetails details = new AccountDetails();

        // Get account details
        Account account = details.getAccountDetails();

        // Get withdraw amount and perform the transaction
        int amount = details.getWithdrawAmount();
        account.withdraw(amount);
    }
}