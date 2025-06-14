//6. Count number of Prime digits in a number
import java.util.Scanner;
public class NthPlacedDigit{
    private static int inputNumber;
    private static int nthIndex;
    private static int nthDigit;
    
    public static void getNthDigit(){
        int tempNumber = inputNumber;
        int lengthOfNumber = (int) Math.log10(tempNumber) + 1;
        if (nthIndex < 0 || nthIndex >= lengthOfNumber) {
            System.out.println("Invalid index. Please enter a valid index.");
        }
        else {
            for (int i = 0; i < lengthOfNumber - nthIndex - 1; i++) {
                tempNumber /= 10;
            }
            nthDigit = tempNumber % 10;
            System.out.println("The digit at index " + nthIndex + " is: " + nthDigit);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        System.out.print("Enter the index of the digit to retrieve (0 for last digit): ");
        nthIndex = scanner.nextInt();
        getNthDigit();
        scanner.close();
    }
}