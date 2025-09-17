import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("provide number a");
        double a = sc.nextDouble();

        System.out.println("enter *,+,-,/ ");
        char operator = sc.next().charAt(0);

        System.out.println("provide number a");
        double b = sc.nextDouble();
        double result;

        switch (operator) {

            case '*':
                result = a * b;
                System.out.println("result is " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("result is " + result);
                break;
            case '+':
                result = a + b;
                System.out.println("result is " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("result is " + result);
                break;

            default:
                System.out.println("invalid input");
        }

    }
}
