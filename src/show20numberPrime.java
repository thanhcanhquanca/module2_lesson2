import java.util.Scanner;

public class show20numberPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int numbers = scanner.nextInt();

        int count = 0;

        int N = 2;

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;

            }
            N++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
