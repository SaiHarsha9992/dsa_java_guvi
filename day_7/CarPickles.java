import java.util.*;

public class Carpickles {
    private static int inputN;
    private static int[] convertedArray;
    private static int bigNumber;
    private static int smallNumber;
    private static int differenceNumber;
    private static int count = 0;

    private static void reverseNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static int findBiggestNumber(int n) {
        int[] digits = new int[ (int) Math.log10(n) + 1];
        int index = digits.length - 1;
        while (n > 0) {
            digits[index] = n % 10;
            n /= 10;
            index--;
        }
        Arrays.sort(digits);
        reverseNumber(digits);
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
    private static int findSmallestNumber(int n) {
        int[] digits = new int[ (int) Math.log10(n) + 1];
        int index = digits.length - 1;
        while (n > 0) {
            digits[index] = n % 10;
            n /= 10;
            index--;
        }
        Arrays.sort(digits);
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;       
        }
        return result;
    }

    private static int findCarPickles( int inputN){
        bigNumber = findBiggestNumber(inputN);
        smallNumber = findSmallestNumber(inputN);
        differenceNumber = bigNumber - smallNumber;
        System.out.println("Difference: " + differenceNumber);

        if (differenceNumber == 6174) {
            return count;
        }
        else{
            inputN = differenceNumber;
            count++;
            findCarPickles(inputN);
        }
        return count;
    }

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        inputN = scanner.nextInt();
        int finalCount = findCarPickles(inputN);
        System.out.println("Final Count: " + count);
        scanner.close();
    }
}