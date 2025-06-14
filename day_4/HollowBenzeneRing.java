//6. Write a program to print Hollow Benzene Ring of N lines.
import java.util.Scanner;
public class HollowBenzeneRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < Math.abs(3 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < width - 2 * Math.abs(3 - i); j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("*"); 
                } else if (j == 0 || j == width - 2 * Math.abs(3 - i) - 1) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }

            System.out.println(); 
        }
    }
}
