//Program for column major traversal of a 2D array
import java.util.Scanner;

public class ColumnMajor {
    public static void main(String[] args) {
        int[][] myArray;
        int size, maxSize;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements in 2D array: ");
        size = input.nextInt();
        myArray = new int[size][];
        for(int arrayPointer = 0; arrayPointer < myArray.length; ++arrayPointer) {
            System.out.print("Enter no. of elements in array" + (arrayPointer+1) + ": ");
            size = input.nextInt();
            myArray[arrayPointer] = new int[size];
            System.out.println("Enter " + myArray[arrayPointer].length + " nos:");
            for(int position = 0; position < myArray[arrayPointer].length; ++position)
                myArray[arrayPointer][position] = input.nextInt();
        }

        maxSize = 0;
        for(int[] array : myArray)
            if(array.length > maxSize)
                maxSize = array.length;
        for(int column = 0; column < maxSize; ++column) {
            for(int row = 0; row < myArray.length; ++row)
                if(column < myArray[row].length)
                    System.out.print("\t" + myArray[row][column]);
                else System.out.print("\t#");
            System.out.println();
        }

        input.close();
    }
}
