import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue {
    private List<Integer> queue;

    {
        queue = new ArrayList<>();
    }

    public void enQueue(int value) {
        queue.add(0, value);
    }

    public Integer deQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue.remove(queue.size() - 1); 
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue contents (front to rear):");
        System.out.println("-------------------------------");
        for (int value : queue) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        int choice;
        int numberOfOperations = 10;

        do {
            System.out.print("1:EnQueue  2:DeQueue  3:DisplayQueue  4:Exit  →  Your choice? ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enQueue(value);
                    break;
                case 2:
                    Integer removed = queue.deQueue();
                    if (removed != null)
                        System.out.println("Dequeued value: " + removed);
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    queue = null;
                    numberOfOperations = 0;
                    break;
                default:
                    System.out.println("Invalid choice entered.");
            }
            numberOfOperations--;
        } while (numberOfOperations >= 0);

        System.out.println("End of Program");
        scanner.close();
    }
}
