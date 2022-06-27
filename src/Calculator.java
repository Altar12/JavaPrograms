import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int firstNumber, secondNumber, result;
        byte choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
        System.out.print("Enter your choice: ");
        choice = input.nextByte();
        if(choice >= 1 && choice <= 5) {
            if(choice == 1) result = firstNumber + secondNumber;
            else if(choice == 2) result = firstNumber - secondNumber;
            else if(choice == 3) result = firstNumber * secondNumber;
            else if(choice == 4) result = firstNumber / secondNumber;
            else result = firstNumber % secondNumber;
            System.out.println("Result is: " + result);
        }
        else System.out.println("Invalid choice!");
        input.close();
    }
}
