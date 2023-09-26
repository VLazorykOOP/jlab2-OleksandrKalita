import java.util.Scanner;

public class Account {
    private String lastName;
    private long accountNumber;
    private double interestRate;
    private double balance;

    public Account(String lastName) {
        this.lastName = lastName;
        this.accountNumber = System.currentTimeMillis();
        this.interestRate = 7;
        this.balance = 0;
    }
    public void getInfo() {
        System.out.println("- - - - - - - - - - - - -");
        System.out.println("Last Namae: " + this.lastName);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Interseted rate: " + this.interestRate);
        System.out.println("Balance: " + this.balance + "грн.");
        System.out.println("- - - - - - - - - - - - -");
    }
    public void changeOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new user Name: ");
        this.lastName = scanner.nextLine();
    }
    public void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("Enter withdraw amount: ");
            double amount = scanner.nextDouble();
        
            if(amount < 0 || amount > this.balance) {
                System.out.println("Not enaugh money.");
            }else {
                this.balance -= amount;
                System.out.println("Successful transaction.");
                break;
            }
        }while(true);
    }
    public void topUpMoney() {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter top up amount: ");
            double amount = scanner.nextDouble();
            if(amount < 0) {
                System.out.println("Not correct amount.");
            }else {
                this.balance += amount;
                System.out.println("Successful transaction.");
                break;
            }
        }while(true);
    }
    public void calculateInterest() {
        double calculateInterest = this.balance * (this.interestRate / 100);
        balance += calculateInterest;
    }
    public void getSum() {

    }
}