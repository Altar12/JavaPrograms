import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA, matrixB, resultant;
        int rowA, rowB, columnA, columnB, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dimensions of first matrix (row & col): ");
        rowA = input.nextInt();
        columnA = input.nextInt();
        System.out.print("Enter dimensions of second matrix (row & col): ");
        rowB = input.nextInt();
        columnB = input.nextInt();

        if(columnA == rowB) {
            matrixA = new int[rowA][columnA];
            matrixB = new int[rowB][columnB];
            resultant = new int[rowA][columnB];
            System.out.println("Enter first matrix:");
            for(int row = 0; row < matrixA.length; ++row)
                for(int column = 0; column < matrixA[row].length; ++column)
                    matrixA[row][column] = input.nextInt();
            System.out.println("Enter second matrix:");
            for(int row = 0; row < matrixB.length; ++row)
                for(int column = 0; column < matrixB[row].length; ++column)
                    matrixB[row][column] = input.nextInt();

            for(int row = 0; row < resultant.length; ++row)
                for(int column = 0; column < resultant[row].length; ++column) {
                    sum = 0;
                    for(int position = 0; position < matrixB.length; ++position)
                        sum += matrixA[row][position] * matrixB[position][column];
                    resultant[row][column] = sum;
                }
            System.out.println("Resultant matrix is:");
            for(int row = 0; row < resultant.length; ++row) {
                for(int column = 0; column < resultant[row].length; ++column)
                    System.out.print(resultant[row][column] + "\t");
                System.out.println();
            }
        }
        else System.out.println("Matrix dimensions not compatible for multiplication...");

        input.close();
    }
}
