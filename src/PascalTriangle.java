import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int[] numbers;
        int height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of pascal's triangle: ");
        height = input.nextInt();
        numbers = new int[height];

        for(int currentRow = 0; currentRow < height; ++currentRow) {
            for(int currentElement = currentRow - 1; currentElement > 0; --currentElement)
                numbers[currentElement] += numbers[currentElement-1];
            numbers[currentRow] = 1;
            for(int rowSpaceCount = currentRow; rowSpaceCount < height - 1; ++rowSpaceCount)
                System.out.print("\t");
            for(int currentElement = 0; currentElement <= currentRow; ++currentElement)
                System.out.print(numbers[currentElement] + "\t\t");
            System.out.println();
        }

        input.close();
    }
}
