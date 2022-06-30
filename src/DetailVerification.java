import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DetailVerification {
    public static void main(String[] args) {
        String name, phoneNumber, universitySeatNumber, emailID, password;
        boolean isValidName, isValidPhoneNumber, isValidUniversitySeatNumber, isValidEmailID;
        //flags for checking password
        boolean isLengthCorrect, hasNumber, hasSmallLetter, hasCapitalLetter, hasSpecialSymbol;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student details");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Phone number: ");
        phoneNumber = input.nextLine();
        System.out.print("USN: ");
        universitySeatNumber = input.nextLine();
        System.out.print("Email ID: ");
        emailID = input.nextLine();

        isValidName = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]*){0,2}").matcher(name).find();
        isValidPhoneNumber = Pattern.compile("^[6789]\\d{9}$").matcher(phoneNumber).find();
        isValidUniversitySeatNumber = Pattern.compile("^1NT\\d{2}(CS|IS|EC|ME|CV|EL|AE)\\d{3}$").matcher(universitySeatNumber).find();
        isValidEmailID = Pattern.compile("^[a-zA-Z0-9.]+@[a-z]+.com$").matcher(emailID).find();

        if(isValidName && isValidPhoneNumber && isValidUniversitySeatNumber && isValidEmailID) {
            System.out.println("Valid details entered");
            System.out.println("Please choose a password (minimum 1 spl symbol, 1 smallcase, 1 uppercase, 1 number and minimum length of 8):");
            password = input.nextLine();
            isLengthCorrect = password.length() >= 8;
            hasNumber = Pattern.compile("\\d").matcher(password).find();
            hasSmallLetter = Pattern.compile("[a-z]").matcher(password).find();
            hasCapitalLetter = Pattern.compile("[A-Z]").matcher(password).find();
            hasSpecialSymbol = Pattern.compile("[^a-zA-Z0-9 ]").matcher(password).find();
            if(isLengthCorrect && hasNumber && hasSmallLetter && hasCapitalLetter && hasSpecialSymbol)
                System.out.println("Password accepted...");
            else {
                if(!isLengthCorrect) System.out.println("Password doesn't meet minimum length criteria");
                if(!hasNumber) System.out.println("Password should have atleast one number");
                if(!hasSmallLetter) System.out.println("Password should have atleast one small letter");
                if(!hasCapitalLetter) System.out.println("Password should have atleast one capital letter");
                if(!hasSpecialSymbol) System.out.println("Password should have atleast one special character");
            }
        }
        else {
            if(!isValidName) System.out.println("Invalid name...");
            if(!isValidPhoneNumber) System.out.println("Invalid phone number...");
            if(!isValidUniversitySeatNumber) System.out.println("Invalid USN...");
            if(!isValidEmailID) System.out.println("Invalid email ID...");
            System.out.println("Please enter valid details...");
        }

        input.close();
    }
}
