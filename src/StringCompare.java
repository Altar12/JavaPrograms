import java.util.Scanner;

public class StringCompare {
    public static int stringCompare(String firstString, String secondString) {
        int firstLength, secondLength, smallerLength;
        char firstChar, secondChar;
        firstLength = firstString.length();
        secondLength = secondString.length();
        smallerLength = firstLength < secondLength? firstLength : secondLength;
        
        for(int position = 0; position < smallerLength; ++position) {
            firstChar = firstString.charAt(position);
            secondChar = secondString.charAt(position);
            if(firstChar < secondChar) return -1;
            if(firstChar > secondChar) return 1;
        }
        if(firstLength < secondLength) return -1;
        else if(firstLength > secondLength) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        String firstString, secondString;
        int compareResult;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        firstString = input.nextLine();
        System.out.print("Enter second string: ");
        secondString = input.nextLine();

        compareResult = stringCompare(firstString, secondString);
        switch(compareResult) {
            case -1:
                System.out.println("First string is smaller than second");
                break;
            case 1:
                System.out.println("First string is greater than second");
                break;
            default:
                System.out.println("Both strings are equal");
        }

        input.close();
    }
}
