import java.util.Scanner;
public class Main{
    private static int inputA, inputB;

    private static int isPrime(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    private static void findPrimesInaRange(){
        for ( int index = inputA; index <= inputB; index++){
            if (index == inputB - 1){
                if( isPrime(index) == 1) {
                    System.out.print(index);
                }
            } else{
                if( isPrime(index) == 1) {
                    System.out.print(index + " ");
                }
            }
        }
            
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputA = sc.nextInt();
        inputB = sc.nextInt(); 
        findPrimesInaRange();
        sc.close();
    }
}