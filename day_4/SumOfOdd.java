//2. Find sum of Odd digits of a number.    
import java.util.Scanner;
public class SumOfOdd{
    public static class OddSum{
        private int number;
        public void setInput(int number) {
            this.number = number;
        }
        public int sumOfOddIndexes(){
            int sumOfTerms = 0;
            while(number > 0){
                int digit = number % 10;
                if (digit % 2 != 0) {
                    sumOfTerms += digit;
                }
                number /= 10;
            }
            return sumOfTerms;
        }
    }

    public static void main(String[] args){
        OddSum obj = new OddSum();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Input = scanner.nextInt();
        obj.setInput(Input);
        System.out.println("Sum of Odd Digits: " + obj.sumOfOddIndexes());
        scanner.close();
    }
}