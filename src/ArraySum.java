import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int size, sum;
        float average;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to enter: ");
        size = input.nextInt();
        numbers = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for(int position = 0; position < numbers.length; ++position)
            numbers[position] = input.nextInt();

        sum = 0;
        for(int position = 0; position < numbers.length; ++position)
            sum += numbers[position];
        average = sum * 1.0f / numbers.length;
        System.out.println("Numbers sum: " + sum + ", Numbers average: " + average);

        input.close();
    }
}
