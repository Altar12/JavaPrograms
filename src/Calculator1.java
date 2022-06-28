import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        System.out.print("Enter your choice (+,-,/,*,%): ");
        choice = input.next().charAt(0);

        switch(choice) {
            case '+':
                System.out.println("Result: " + (firstNumber+secondNumber));
                break;
            case '-':
                System.out.println("Result: " + (firstNumber-secondNumber));
                break;
            case '*':
                System.out.println("Result: " + (firstNumber*secondNumber));
                break;
            case '/':
                System.out.println("Result: " + (firstNumber*1.0/secondNumber));
                break;
            case '%':
                System.out.println("Result: " + (firstNumber%secondNumber));
                break;
            default:
                System.out.println("Invalid input!");
        }

        input.close();
    }
}
