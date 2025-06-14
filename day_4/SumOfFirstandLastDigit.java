//4. Find the sum of the first and last digit of a number.
import java.util.Scanner;
public class SumOfFirstandLastDigit{
    private static int inputNumber;
    private static int firstDigit;
    private static int lastDigit;
    private static int sumOfFirstAndLastDigit;

    public static void findSumOfFirstAndLastDigit(){
        int tempNumber = inputNumber;
        lastDigit = tempNumber % 10;
        while(inputNumber > 0){
            firstDigit = inputNumber % 10;
            inputNumber /= 10;
        }
        sumOfFirstAndLastDigit = firstDigit + lastDigit;
        System.out.println("Sum of First and Last Digit: " + sumOfFirstAndLastDigit);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        findSumOfFirstAndLastDigit();
        scanner.close();
    }
}