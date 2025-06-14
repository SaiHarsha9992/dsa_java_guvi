import java.util.Scanner;
public class SumOfEvenOddDigits{
    private static int inputNumber;
    private static int sumOfEvenDigits;
    private static int sumOfOddDigits;

    public static void calculateSumOfEvenDigits(){
        int tempNumber = inputNumber;
        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if (digit % 2 == 0) {
                sumOfEvenDigits += digit;
            }
            tempNumber /= 10;
        }
        System.out.println("Sum of Even Digits: " + sumOfEvenDigits);
    }
    public static void calculateSumOfOddDigits(){
        int tempNumber = inputNumber;
        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if (digit % 2 != 0) {
                sumOfOddDigits += digit;
            }
            tempNumber /= 10;
        }
        System.out.println("Sum of Odd Digits: " + sumOfOddDigits);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        calculateSumOfEvenDigits();
        calculateSumOfOddDigits();
        scanner.close();
    }
}