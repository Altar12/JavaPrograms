import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[][] matrix, firstCopy, secondCopy;
        int rowCount, columnCount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix dimensions: ");
        rowCount = input.nextInt();
        columnCount = input.nextInt();
        matrix = new int[rowCount][columnCount];
        System.out.println("Enter the matrix:");
        for(int row = 0; row < matrix.length; ++row)
            for(int column = 0; column < matrix[row].length; ++column)
                matrix[row][column] = input.nextInt();

        //copying using Arrays.copyOfRange function
        firstCopy = new int[matrix.length][];
        for(int row = 0; row < matrix.length; ++row)
            firstCopy[row] = Arrays.copyOfRange(matrix[row], 0, matrix[row].length);

        //copying using System.arraycopy function
        secondCopy = new int[matrix.length][];
        for(int row = 0; row < matrix.length; ++row) {
            secondCopy[row] = new int[matrix[row].length];
            System.arraycopy(matrix[row], 0, secondCopy[row], 0, matrix[row].length);
        }

        System.out.println("First copied matrix: ");
        for(int[] array : firstCopy)
            System.out.println(Arrays.toString(array));
        System.out.println("Second copied matrix: ");
        for(int[] array : secondCopy)
            System.out.println(Arrays.toString(array));

        input.close();
    }
}
