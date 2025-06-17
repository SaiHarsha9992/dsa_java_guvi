import java.util.*;

public class MissingNumbers {
    private static int inputN;
    private static int inputM;
    private static int[] arrayN;
    private static int[] arrayM;
    private static Set<Integer> missingNumbers = new HashSet<>();

    private static int countInArray(int[] arr, int value) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

    private static void findMissingNumbers() {
        for (int value : arrayM) {
            int countInN = countInArray(arrayN, value);
            int countInM = countInArray(arrayM, value);

            if (countInM > countInN) {
                missingNumbers.add(value);
            }
        }
        
        List<Integer> sortedMissing = new ArrayList<>(missingNumbers);
        Collections.sort(sortedMissing);

        System.out.println("Missing numbers in the first array:");
        for (int num : sortedMissing) {
            System.out.print(num + " ");
        }
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        inputN = scanner.nextInt();
        arrayN = new int[inputN];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < inputN; i++) {
            arrayN[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        inputM = scanner.nextInt();
        arrayM = new int[inputM];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < inputM; i++) {
            arrayM[i] = scanner.nextInt();
        }

        findMissingNumbers();
        scanner.close();
    }
}
