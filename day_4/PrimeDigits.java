import java.util.Scanner;
public class PrimeDigits{
    private static int inputNumber;
    private static int primeDigitCount;

    private static boolean isPrime(int digit) {
        if (digit < 2) return false;
        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0) return false;
        }
        return true;
    }

    private static void findPrimeDigits() {
        int tempNumber = inputNumber;
        primeDigitCount = 0;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (isPrime(digit)) {
                primeDigitCount++;
            }
            tempNumber /= 10;
        }

        System.out.println("The number of prime digits in " + inputNumber + " is: " + primeDigitCount);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();
        findPrimeDigits();
        scanner.close();
    }
}