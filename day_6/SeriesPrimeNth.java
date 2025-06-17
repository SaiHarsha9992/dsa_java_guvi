import java.util.Scanner;

public class SeriesPrimeNth {
    private static int inputNumber;


    private static void generateSeries(int n) {
        int count = 0;
        int num = 2;
        
        while (count < n) {

            if ( count % 2 == 0){
                
            } else (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            
            num++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        inputNumber = scanner.nextInt();
        generateSeries(inputNumber);
        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}