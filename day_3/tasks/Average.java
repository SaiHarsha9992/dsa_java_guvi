import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the average number: ");

        n = scanner.nextInt();

        if(n >= 0 && n < 60){
            System.out.println("Fail");
        }
        else if(n <= 80){
            System.out.println("Second Class");
        }
        else if(n <= 95){
            System.out.println("First Class");
        }
        else if(n <= 100){
            System.out.println("OutStading");
        }
        else{
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        }
        scanner.close();
    }
}