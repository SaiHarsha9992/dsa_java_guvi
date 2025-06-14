import java.util.*;
public class SecondLargestSmallestDigit{
    private static int inputNumber;
    private static int firstLargestNumber;
    private static int secondLargestNumber;
    private static int firstSmallestNumber;
    private static int secondSmallestNumber;

    public static void findSecondLargestNumber(){
        int tempNumber = inputNumber;
        firstLargestNumber = Integer.MIN_VALUE;
        secondLargestNumber = Integer.MIN_VALUE;

        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if (digit > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = digit;
            } else if (digit > secondLargestNumber && digit < firstLargestNumber) {
                secondLargestNumber = digit;
            }
            tempNumber /= 10;
        }
        System.out.println("Second Largest Digit: " + secondLargestNumber);
    }

    public static void findSecondSmallestNumber(){
        int tempNumber = inputNumber;
        firstSmallestNumber = Integer.MAX_VALUE;
        secondSmallestNumber = Integer.MAX_VALUE;

        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if (digit < firstSmallestNumber) {
                secondSmallestNumber = firstSmallestNumber;
                firstSmallestNumber = digit;
            } else if (digit < secondSmallestNumber && digit > firstSmallestNumber) {
                secondSmallestNumber = digit;
            }
            tempNumber /= 10;
        }
        System.out.println("Second Smallest Digit: " + secondSmallestNumber);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        findSecondLargestNumber();
        findSecondSmallestNumber();
        scanner.close();
    }
}