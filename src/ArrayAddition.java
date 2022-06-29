import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] firstList, secondList, result;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array dimension: ");
        size = input.nextInt();
        firstList = new int[size];
        secondList = new int[size];
        result = new int[size];
        System.out.println("Enter first array:");
        for(int position = 0; position < firstList.length; ++position)
            firstList[position] = input.nextInt();
        System.out.println("Enter second array:");
        for(int position = 0; position < secondList.length; ++position)
            secondList[position] = input.nextInt();

        for(int position = 0; position < result.length; ++position)
            result[position] = firstList[position] + secondList[position];
        System.out.println("Addition of the two arrays is:");
        for(int element : result)
            System.out.print(element + "\t");
        System.out.println();
        
        input.close();

    }
}
