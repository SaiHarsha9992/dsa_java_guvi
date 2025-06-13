import java.util.Scanner;
public class PerfectSquare {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int sqrt = (int) Math.sqrt(num);
        
        if (sqrt * sqrt == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

}