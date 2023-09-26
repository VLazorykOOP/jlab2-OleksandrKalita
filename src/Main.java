import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Switch exercise - '1' '2' '3'");
            String str = scanner.nextLine();

            switch(str){
                case "1":
                case "2":
                case "3":
                default:
                    break;
            }
        }while(true);

    }
}
