import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String operation = scann.next();

        boolean nextNumber = false;
        String num1 = "";
        String num2 = "";
        char operation_Sym = '-';

        for (int i = 0; i < operation.length(); i++) {
            boolean isNumber = Character.isDigit(operation.charAt(i));
            if (isNumber && !nextNumber) {
                num1 += operation.charAt(i);
            }
            else if (isNumber) {
                num2 += operation.charAt(i);
            } else {
                operation_Sym = operation.charAt(i);
                nextNumber = true;
            }
        }
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("operation: " + operation_Sym);
        float result = Calculation(Float.parseFloat(num1),Float.parseFloat(num2),operation_Sym);
        System.out.println(result);
    }

    public static float Calculation(float num1, float num2, char operation) {
        switch (operation){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}