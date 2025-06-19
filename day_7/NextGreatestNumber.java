import java.util.*;

public class NextGreatestNumber{
    private static int inputN;
    private static int pivotNumber;
    private static int pivotNumberIndex;
    private static int[] convertedArray;

    private static void reverseFromOneIndexToEnd(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }   
    }

    private static int[] getArrayFromNumber(int number){
        int[] digits = new int[ (int) Math.log10(number) + 1];
        int index = digits.length - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }
        return digits;
    }

    private static int findPivotNumberIndex(int number){
        int[] digits =  getArrayFromNumber(number);
        int pivotIndex = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivotIndex = i;
                break;
            }
        }
        return pivotIndex;
    }

    private static int findNextGreatestNumber(){
        pivotNumberIndex = findPivotNumberIndex(inputN);
        if (pivotNumberIndex == -1) {
            return -1; 
        }
        convertedArray = getArrayFromNumber(inputN);
        
        int nextSmallestElement = convertedArray[pivotNumberIndex + 1];
        int nextSmallestElementIndex = pivotNumberIndex + 1;
        for (int i = convertedArray.length - 1; i >= pivotNumberIndex + 1; i--) {
            if (convertedArray[i] > convertedArray[pivotNumberIndex] ) {
                nextSmallestElementIndex = i;
                break;
            }
        }
        int tempArrayElement =  convertedArray[pivotNumberIndex];
        convertedArray[pivotNumberIndex] = convertedArray[nextSmallestElementIndex];
        convertedArray[nextSmallestElementIndex] = tempArrayElement;

        
        reverseFromOneIndexToEnd(convertedArray, pivotNumberIndex + 1, convertedArray.length - 1);
        

        int result = 0;
        for (int digit : convertedArray) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        inputN = scanner.nextInt();
        int finalNumber = findNextGreatestNumber();
        if (finalNumber == -1) {
            System.out.println("No next greatest number");
        } else {
            System.out.println("Next greatest number: " + finalNumber);
        }
        scanner.close();
    }
}