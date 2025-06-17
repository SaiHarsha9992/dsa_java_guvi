import java.util.*;

public class SumOfNegatives {
    private static int inputN;
    private static int inputP;
    private static int[] arrayOfPrices;
    private static int sum;
    private static void findSumOfNegativePrices(){
        Arrays.sort(arrayOfPrices);
        sum = 0;

        for (int index = 0; index < inputP; index++){
            if (arrayOfPrices[index] < 0) {
                sum += arrayOfPrices[index];
            }
        }

        System.out.println("Money they earned: " + -1 * (sum));
    }

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prices: ");
        inputN = scanner.nextInt();
        arrayOfPrices = new int[inputN];
        System.out.print("Enter the Carry P pair of Shoes: ");
        inputP = scanner.nextInt();
        System.out.print("Enter the prices of the shoes: ");
        for (int i = 0; i < inputN; i++) {
            arrayOfPrices[i] = scanner.nextInt();
        }
        findSumOfNegativePrices();
        scanner.close();
    }

}