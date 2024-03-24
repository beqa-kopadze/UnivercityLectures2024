import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("What is the temperature today: ");
        boolean app = true;
        int celsius = 0;


        while (app) {
            try {
                celsius = scann.nextInt();
            } catch (InputMismatchException e) {
                app = false;
                break;
            }

            if (celsius < 0) {
                System.out.println("Freezing");
            } else if (celsius <= 15) {
                System.out.println("Cold");
            } else if (celsius <= 25) {
                System.out.println("Mild");
            } else if (celsius <= 35) {
                System.out.println("Warm");
            } else {
                System.out.println("Hot");
            }
        }
    }
}
