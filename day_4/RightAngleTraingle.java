//1. Write a program to print Right angled TRiangle of N lines.
import java.util.Scanner;
public class RightAngleTraingle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right angle triangle:");
        int n = sc.nextInt(); 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}