import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number of exercise '1' '2' '3': "); 
            int num = scanner.nextInt();
            if(num == 1) {
                firstTask();
            }else if(num == 2) {
                secondTask();
            }else if(num == 3) {
                thirdTask();
            }
            else {
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
            System.out.print("'1' - change Name\n'2' - withdraw money\n'3' - top up money\n'4' - calculateInterest\n'5' - Get info\n'6' - Exit - -> .\nEnter:");
            int number = scanner.nextInt();

            if(number == 1) {
                System.out.println("Enter new user Name: ");
                String name = scanner.nextLine();
                firstAccout.changeOwner(name);
            }else if(number == 2) {
                firstAccout.withdrawMoney();
            }else if(number == 3) {
                do{
                    System.out.print("Enter top up amount: ");
                    double amount = scanner.nextDouble();
                    if(amount < 0) {
                        System.out.println("Not correct amount.");
                    }else {
                        firstAccout.topUpMoney(amount);
                        System.out.println("Successful transaction.");
                        break;
                    }
                }while(true);
            }else if(number == 4) {
                firstAccout.calculateInterest();
            }else if(number == 5){
                System.out.println(firstAccout.toString());
            }else if(number == 6){
                break;
            }else {
                System.out.println("Try again");
            }
        } while(true);
    }
    public static void secondTask() {
        ComplexNumber number1 = new ComplexNumber(3, 4);
        ComplexNumber number2 = new ComplexNumber(3, 4);

        System.out.println(number1.module());
        System.out.println(number1.argument());
        System.out.println(number1.add(number2).getNumber());
        System.out.println(number1.subtract(number2).getNumber());
        System.out.println(number1.multiply(number2).getNumber());
        System.out.println(number1.divide(number2).getNumber());
        System.out.println(number1.conjugate().getNumber());
    }
    public static void thirdTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first real number: ");
        double first_real = scanner.nextDouble();
        System.out.print("Enter first imaginary number: ");
        double first_imaginary = scanner.nextDouble();
        System.out.print("Enter second real number: ");
        double second_real = scanner.nextDouble();
        System.out.print("Enter second imaginary number: ");
        double second_imaginary = scanner.nextDouble();

        Complex number1 = new Complex(first_real, first_imaginary);
        Complex number2 = new Complex(second_real, second_imaginary);

        System.out.println(number1.module());
        System.out.println(number1.argument());
        System.out.println(number1.add(number2).getNumber());
        System.out.println(number1.subtract(number2).getNumber());
        System.out.println(number1.multiply(number2).getNumber());
        System.out.println(number1.divide(number2).getNumber());
        System.out.println(number1.conjugate().getNumber());
    }
}

/* 
Є основна функція Main в якій реалізоване меню між трьома завданнями
за допомогою цикла do while, та 3 функції з інтерфейсами до кожного завдання
(firstTask, secondTask, thirdTask).


*/