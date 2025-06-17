import java.util.*;
public class ArrayDivide{
    private static int inputN, inputX, inputY, outputP;
    private static int[] inputArray;

    private static void findValueP() {
        Arrays.sort(inputArray);
        outputP = inputArray[inputY] - inputArray[inputY - 1] -1;
        System.out.println("The Number of P Values: "+ outputP);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (N): ");
        inputN = scanner.nextInt();
        System.out.print("Enter the value of X: ");
        inputX = scanner.nextInt();
        System.out.print("Enter the value of Y: ");
        inputY = scanner.nextInt();
        if (inputX + inputY != inputN) {
            System.out.println("Invalid input: X + Y must be equal to N.");
        } else{
            System.out.print("Enter the elements of the array: ");
            inputArray = new int[inputN];
            for(int i = 0; i < inputN; i++){
                inputArray[i] = scanner.nextInt();
            }
            findValueP();
        }
        
    }
}