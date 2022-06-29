import java.util.Scanner;

public class Stack {
    private int[] numbers;
    private int top;
    Stack(int size) {
        numbers = new int[size];
        top = -1;
    }
    public void push(int element) {
        if(top == numbers.length - 1)
            System.out.println("Stack overflow...");
        else
            numbers[++top] = element;
    }
    public void pop() {
        if(top == -1)
            System.out.println("Stack underflow...");
        else
            System.out.println("Popped " + numbers[top--]);
    }
    public String toString() {
        if(top == -1)
            return "[]";
        String result = "[" + numbers[0];
        for(int position = 1; position <= top; ++position)
            result = result + ", " + numbers[position];
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        int size, element;
        byte choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        size = input.nextInt();
        Stack myStack = new Stack(size);

        do {
            System.out.println("1. Push\t2. Pop\t3. Print Stack\t4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextByte();
            switch(choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    element = input.nextInt();
                    myStack.push(element);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    System.out.println("Current stack: " + myStack);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        }while(choice != 4);

        input.close();
    }
}
