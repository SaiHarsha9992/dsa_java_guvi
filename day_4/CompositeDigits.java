import java.util.Scanner;
public class CompositeDigits{
    private static int inputNumber;
    private static int compositeDigitCount;

    public static void findCompositeDigitCount() {
        int tempNumber = inputNumber;
        compositeDigitCount = 0;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (isComposite(digit)) {
                compositeDigitCount++;
            }
            tempNumber /= 10;
        }

        System.out.println("The number of composite digits in " + inputNumber + " is: " + compositeDigitCount);
    }

    public static boolean isComposite(int digit) {
        if (digit < 4) return false; 
        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0 && digit != i) {
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        findCompositeDigitCount();
    }
}