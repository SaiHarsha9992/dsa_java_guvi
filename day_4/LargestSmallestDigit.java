//3. Find smallest and largest digit in a number.
import java.util.Scanner;
public class LargestSmallestDigit{
    private static int inputNumber;
    private static int largestDigit;
    private static int smallestDigit;

    public static void findLargestAndSmallestDigits(){
        int tempNumber = inputNumber;
        largestDigit = Integer.MIN_VALUE;
        smallestDigit = Integer.MAX_VALUE;

        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            tempNumber /= 10;
        }
        System.out.println("Largest Digit: " + largestDigit);
        System.out.println("Smallest Digit: " + smallestDigit);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        findLargestAndSmallestDigits();
        scanner.close();
    }
}