import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println("You entered: " + number);
        System.out.println(number % 2 == 0? "The number is even": "The number is odd");
        System.out.println(number < 0? "The number is negative": "The number is positive");
        System.out.println("Square of the number is: " + (number*number));
        System.out.println("Half of the number is: " + (number/2.0));
        input.close();
    }
}
