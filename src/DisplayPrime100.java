import java.util.Scanner;

public class DisplayPrime100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100 ; i++) {
            if (Prime(i)){
                System.out.println(i);
            }
        }


    }

    public static boolean Prime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
