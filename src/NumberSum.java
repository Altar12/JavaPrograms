import java.time.temporal.JulianFields;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        int sum, number;
        char choice;
        Scanner input = new Scanner(System.in);

        sum = 0;
        while(true) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            sum += number;
            System.out.print("Enter Y to enter more nos: ");
            choice = input.next().charAt(0);
            if(choice != 'Y') break;
        }

        System.out.println("Sum of nos entered is: " + sum);
        input.close();
    }
}
