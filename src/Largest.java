import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, largest;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        thirdNumber = input.nextInt();

        if(firstNumber > secondNumber) {
            if(firstNumber > thirdNumber) largest = firstNumber;
            else largest = thirdNumber;
        }
        else {
            if(secondNumber > thirdNumber) largest = secondNumber;
            else largest = thirdNumber;
        }
        // largest = firstNumber > secondNumber?(firstNumber > thirdNumber? firstNumber: thirdNumber):(secondNumber > thirdNumber? secondNumber: thirdNumber);


        System.out.println("Largest number is: " + largest);
        input.close();
    }
}
