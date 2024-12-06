import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter height :");
                int height = sc.nextInt();
                System.out.println("Enter with: ");
                int width = sc.nextInt();

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("1. Bottom-left");
                System.out.println("2. Top-left");
                System.out.println("3. Bottom-right");
                System.out.println("4. Top-right");
                System.out.print("Choose the triangle corner: ");
                int cornerChoice = sc.nextInt();

                System.out.println("Enter the size :");
                int size = sc.nextInt();

                switch (cornerChoice) {
                    case 1:
                        for (int i = 0; i <= size; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                }

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice ! please choose again");
                break;
        }

    }
}
