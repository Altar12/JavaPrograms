//Highest Common Factor of two positive integers

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, smaller, result;
        System.out.println("Enter two numbers: ");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        
        smaller = firstNumber < secondNumber? firstNumber:secondNumber;
        result = 1;
        for(int i=2; i <= smaller; ++i) {
            if(firstNumber%i == 0 && secondNumber%i == 0)
                result = i;
        }
        System.out.println("Highest common factor of " + firstNumber + " and " + secondNumber + " is: " + result);

        input.close();
    }
}
