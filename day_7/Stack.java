import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
    private int stackPtr;
    private List<Integer> stack;

    {
        stackPtr = -1;
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
        stackPtr++;
    }

    public Integer pop() {
        if (stackPtr == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        int value = stack.get(stackPtr);
        stack.remove(stackPtr);
        stackPtr--;
        return value;
    }

    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents (top to bottom):");
        System.out.println("------------------------------");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack integerStack = new Stack();
        int choice;
        int numberOfOperations = 10;

        do {
            System.out.print("1:Push  2:Pop  3:DisplayStack  4:Exit  →  Your choice? ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int value = scanner.nextInt();
                    integerStack.push(value);
                    break;
                case 2:
                    Integer popped = integerStack.pop();
                    if (popped != null)
                        System.out.println("Popped value: " + popped);
                    break;
                case 3:
                    integerStack.displayStack();
                    break;
                case 4:
                    integerStack.stack = null;
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
