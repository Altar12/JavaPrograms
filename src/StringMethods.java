//implementing string method replace(substring, newSubstring)
import java.util.Scanner;

public class StringMethods {
    //returns the index of the first occurence of pattern if present in text, -1 otherwise
    public static int contains(String text, String pattern) {
        int foundPosition, textLength, patternLength;
        boolean mismatchFound = false;
        foundPosition = -1;
        textLength = text.length();
        patternLength = pattern.length();
        for(int start = 0; start <= textLength - patternLength; ++start) {
            for(int position = 0; position < patternLength; ++position)
                if(text.charAt(start + position) != pattern.charAt(position)) {
                    mismatchFound = true;
                    break;
                }
            if(!mismatchFound) {
                foundPosition = start;
                break;
            }
            mismatchFound = false;
        }

        return foundPosition;
    }
    //returns substring constructed with chars starting with startIndex & ending with endIndex-1
    public static String substring(String text, int startIndex, int endIndex) {
        String resultant = "";
        for(int position = startIndex; position < endIndex; ++position)
            resultant += text.charAt(position);
        
        return resultant;
    }

    public static String replace(String text, String oldSequence, String newSequence) {
        String resultant = "";
        int oldSequenceLength = oldSequence.length();
        for(int substringPosition = contains(text, oldSequence); substringPosition > -1; substringPosition = contains(text, oldSequence)) {
            resultant = resultant + substring(text, 0, substringPosition) + newSequence;
            text = substring(text, substringPosition + oldSequenceLength, text.length());
        }
        resultant += text;

        return resultant;
    }

    public static void main(String[] args) {
        String text, oldSequence, newSequence, modifiedText;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to modify: ");
        text = input.nextLine();
        System.out.print("Enter the pattern to replace: ");
        oldSequence = input.nextLine();
        System.out.print("Enter the pattern to replace with: ");
        newSequence = input.nextLine();

        modifiedText = replace(text, oldSequence, newSequence);
        System.out.println("Modified string is: " + modifiedText);

        input.close();
    }
}
