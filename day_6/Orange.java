import java.util.*;

public class Orange{
    private static int inputNumber;
    private static int[] orangeArray;

    private static void orangesAfterPartition(){
        int kIndex = 0;
        for (int i = 0; i < inputNumber; i++){
            if (orangeArray[i] < orangeArray[inputNumber-1]){
                int tempNumber = orangeArray[i];
                orangeArray[i] = orangeArray[kIndex];
                orangeArray[kIndex] = tempNumber;
                kIndex++;
            }
        }
        int tempNumber = orangeArray[kIndex];
        orangeArray[kIndex] = orangeArray[inputNumber - 1];
        orangeArray[inputNumber - 1] = tempNumber;


        Arrays.sort(orangeArray, 0, kIndex);
        Arrays.sort(orangeArray, kIndex + 1, inputNumber);
        System.out.println("Oranges after partitioning:");
        for (int i = 0; i < inputNumber; i++) {
            System.out.print(orangeArray[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of oranges: ");
        inputNumber = scanner.nextInt();
        orangeArray = new int[inputNumber];
        System.out.print("Enter the weights of the oranges:");
        for (int i = 0; i < inputNumber; i++) {
            orangeArray[i] = scanner.nextInt();
        }
        orangesAfterPartition();
        scanner.close();
    }
}