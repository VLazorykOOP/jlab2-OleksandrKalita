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
    @Override
    public String toString() {
        return "- - - - - - - - - - - - -" + 
        "\nLast Namae: " + this.lastName + 
        "\nAccount number: " + this.accountNumber + 
        "\nInterseted rate: " + this.interestRate + 
        "\nBalance: " + this.balance + "грн." + 
        "\n- - - - - - - - - - - - -";
    }
    public void changeOwner(String newOwner) {
        this.lastName = newOwner;
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
    public void topUpMoney(double amount) {
        this.balance += amount;
    }
    public void calculateInterest() {
        double calculateInterest = this.balance * (this.interestRate / 100);
        balance += calculateInterest;
    }
}