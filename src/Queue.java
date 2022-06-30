import java.util.Scanner;

public class Queue {
    private int[] numbers;
    private int front, rear;

    public Queue(int size) {
        numbers = new int[size];
        front = rear = -1;
    }
    public Queue() {
        this(10);
    }
    public boolean isFull() {
        boolean fullStatus = (rear + 1) % numbers.length == front;
        return fullStatus;
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public void insert(int element) {
        if(isFull()) {
            int[] temporary;
            int positionInOld, positionInNew;
            temporary = new int[2 * numbers.length];
            positionInOld = front - 1;
            positionInNew = - 1;
            do {
                ++positionInNew;
                positionInOld = (positionInOld + 1) % numbers.length;
                temporary[positionInNew] = numbers[positionInOld];
            } while(positionInOld != rear);
            numbers = temporary;
            front = 0;
            rear = positionInNew;
        }
        else if(isEmpty()) front = 0;

        rear = (rear + 1) % numbers.length;
        numbers[rear] = element;
        System.out.println("Inserted " + numbers[rear]);
    }
    public void remove() {
        if(isEmpty()) System.out.println("No element to remove...");
        else {
            int element = numbers[front];
            if(front == rear) front = rear = -1;
            else front = (front + 1) % numbers.length;
            System.out.println("Removed " + element);
        }
    }
    public String toString() {
        if(isEmpty()) return "front->[]<-rear";
        String resultant = "" + numbers[front];
        int position = front;
        while(position != rear) {
            position = (position + 1) % numbers.length;
            resultant += ", " + numbers[position];
        }
        resultant = "front->[" + resultant + "]<-rear";
        return resultant;
    }

    public static void main(String[] args) {
        Queue myQueue;
        int size, element;
        byte choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial queue size: ");
        size = input.nextInt();
        myQueue = new Queue(size);
        do {
            System.out.println("1. Insert element\t2. Remove element\t3. Empty queue\t4. Print queue\t5. Exit");
            choice = input.nextByte();
            switch(choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = input.nextInt();
                    myQueue.insert(element);
                    break;
                case 2:
                    myQueue.remove();
                    break;
                case 3:
                    System.out.println("Emptying queue...");
                    while(! myQueue.isEmpty())
                        myQueue.remove();
                    System.out.println("Emptied queue...");
                    break;
                case 4:
                    System.out.println("Current queue: " + myQueue);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        } while(choice != 5);

        input.close();
    }
}
