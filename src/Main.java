import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number of exercise '1' '2' '3': "); 
            int num = scanner.nextInt();
            if(num == 1) {
                firstTask();
            }else {
                System.out.println("Exit. - ->");
                break;
            }
        } while(true);
    }
    public static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String userName = scanner.nextLine();

        Account firstAccout = new Account(userName);
        do {
            System.out.print("Enter:\n'1' - change Name\n'2' - withdraw money\n'3' - top up money\n'4' - withdraw money\n'5' - calculateInterest\n'6' - Get info\n");
            int number = scanner.nextInt();

            if(number == 1) {
                firstAccout.changeOwner();
            }else if(number == 2) {
                firstAccout.withdrawMoney();
            }else if(number == 3) {
                firstAccout.topUpMoney();
            }else if(number == 4) {
                firstAccout.withdrawMoney();
            }else if(number == 5) {
                firstAccout.calculateInterest();
            }else if(number == 6){
                firstAccout.getInfo();
            }else {
                break;
            }
        } while(true);
    }
}