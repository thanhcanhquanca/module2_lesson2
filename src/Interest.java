import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double interestRate = 1.0;
        double money = 1.0;
        double month = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount : ");
        money = input.nextDouble();
        System.out.println("Enter interest months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage:");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);

    }
}
