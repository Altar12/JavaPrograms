import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int height, updation, row, column;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of the triangle: ");
        height = input.nextInt();

        updation = 1;
        //print pattern of two triangles connect with base
        for(row = 0; row > -1; row += updation) {
            for(column = 0; column < height - 1 - row; ++column)
                System.out.print(" ");
            for(column = 0; column < 2 * row + 1; ++column)
                System.out.print("#");
            System.out.println();
            if(row == height-1) updation = -1;
        }

        input.close();
    }
}
