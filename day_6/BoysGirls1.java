import java.util.*;

public class BoysGirls1 {
    private static int testCases;
    private static int numberOfPeople;
    private static int[] boysHeights;
    private static int[] girlsHeights;
    private static int[] arrangedHeights;
    private static int[] arrangedHeights2;

    private static void readData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        numberOfPeople = scanner.nextInt();
        System.out.print("Enter the heights of boys: ");
        boysHeights = new int[numberOfPeople];
        for (int i = 0; i < boysHeights.length; i++) {
            boysHeights[i] = scanner.nextInt();
        }
        System.out.print("Enter the heights of girls: ");
        girlsHeights = new int[numberOfPeople];
        for (int i = 0; i < girlsHeights.length; i++) {
            girlsHeights[i] = scanner.nextInt();
        }
    }


    private static void arrangePeople(){
        int boysIndex = 0;
        int girlsIndex = 0;
        int boysIndex2 = 0;
        int girlsIndex2 = 0;
        int[] arrangedHeights = new int[2 * numberOfPeople];
        int[] arrangedHeights2 = new int[2 * numberOfPeople];
        Arrays.sort(boysHeights);
        Arrays.sort(girlsHeights);

        for (int index = 0; index < 2 * numberOfPeople; index += 2) {
            arrangedHeights[index] = girlsHeights[girlsIndex++];
            arrangedHeights[index + 1] = boysHeights[boysIndex++];
            arrangedHeights2[index + 1] = girlsHeights[girlsIndex2++];
            arrangedHeights2[index] = boysHeights[boysIndex2++];
        }

        if (isNonDecreasing(arrangedHeights) || isNonDecreasing(arrangedHeights2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isNonDecreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCases = scanner.nextInt();
        for ( int i = 0; i < testCases; i++) {
            readData();
            arrangePeople();
        }

    }
}