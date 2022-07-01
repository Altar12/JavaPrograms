import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String text, pattern;
        int textLength, patternLength, foundPosition;
        boolean mismatchFound;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        text = input.nextLine();
        System.out.print("Enter pattern to search in text: ");
        pattern = input.nextLine();
        
        textLength = text.length();
        patternLength = pattern.length();
        foundPosition = -1;
        mismatchFound = false;
        for(int start = 0; start <= textLength - patternLength; ++start) {
            mismatchFound = false;
            for(int position = 0; position < patternLength; ++position)
                if(text.charAt(start + position) != pattern.charAt(position)) {
                    mismatchFound = true;
                    break;
                }
            if(!mismatchFound) {
                foundPosition = start + 1;
                break;
            } 
        }
        if(!mismatchFound)
            System.out.println("Found pattern at position " + foundPosition);
        else
            System.out.println("Pattern not present in text...");

        input.close();
    }
}
