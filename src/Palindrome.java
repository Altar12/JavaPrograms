import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number, reverse, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        reverse = 0;
        for(temp = number<0?-number:number; temp > 0; temp /= 10) {
            reverse = reverse*10 + temp%10;
        }
        if(number < 0) reverse = -reverse;
        System.out.println("The reverse of " + number + " is: " + reverse);
        if(number == reverse) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");

        input.close();
    }
}
