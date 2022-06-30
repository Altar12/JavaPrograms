import java.util.Scanner;
import java.util.Arrays;

public class ArrayClass {
    //input, sum, addition of arrays, greatest, smallest
    public static int[] input(int size) {
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[size];
        System.out.print("Enter " + numbers.length + " nos: ");
        for(int position = 0; position < numbers.length; ++position)
            numbers[position] = read.nextInt();

        return numbers;
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for(int number : array)
            sum += number;
        return sum;
    }

    public static int[] addArrays(int[] firstArray, int[] secondArray) {
        int smallerSize;
        int[] resultant, largerArray;
        if(firstArray.length > secondArray.length) {
            smallerSize = secondArray.length;
            largerArray = firstArray;
        }
        else {
            smallerSize = firstArray.length;
            largerArray = secondArray;
        }
        resultant = new int[largerArray.length];
        for(int position = 0; position < smallerSize; ++position)
            resultant[position] = firstArray[position] + secondArray[position];
        for(int position = smallerSize; position < largerArray.length; ++position)
            resultant[position] = largerArray[position];

        return resultant; 
    }

    public static int greatestElement(int[] array) {
        int greatest = Integer.MIN_VALUE;
        for(int number : array)
            if(number > greatest)
                greatest = number;
        
        return greatest;
    }

    public static int smallestElement(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for(int number : array)
            if(number < smallest)
                smallest = number;

        return smallest;
    }

    public static void sortArray(int[] array) {
        int smallestPosition, temporary;
        for(int startPosition = 0; startPosition < array.length - 1; ++startPosition) {
            smallestPosition = startPosition;
            for(int position = startPosition + 1; position < array.length; ++position)
                if(array[position] < array[smallestPosition])
                    smallestPosition = position;
            temporary = array[startPosition];
            array[startPosition] = array[smallestPosition];
            array[smallestPosition] = temporary;
        }
    }

    public static void main(String[] args) {
        int[] firstArray, secondArray, resultant;
        int firstSize, secondSize;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        firstSize = read.nextInt();
        firstArray = input(firstSize);
        System.out.print("Enter size of second array: ");
        secondSize = read.nextInt();
        secondArray = input(secondSize);

        System.out.println("Summary:");
        System.out.println("Smallest elements: " + smallestElement(firstArray) + ", " + smallestElement(secondArray));
        System.out.println("Greatest elements: " + greatestElement(firstArray) + ", " + greatestElement(secondArray));
        System.out.println("Sum of elements: " + sumOfElements(firstArray) + ", " + sumOfElements(secondArray));
        resultant = addArrays(firstArray, secondArray);
        System.out.println("Addition of arrays: " + Arrays.toString(resultant));
        sortArray(firstArray);
        sortArray(secondArray);
        System.out.println("Sorted arrays:");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        read.close();
    }
}
