import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String myString, reverse;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        myString = input.nextLine();

        reverse = "";
        for(int position = myString.length()-1; position >= 0; --position) {
            reverse += myString.charAt(position);
        }

        System.out.println("String: " + myString + ", Reversed String: " + reverse);
        input.close();
    }
}
