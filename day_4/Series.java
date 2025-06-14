//1. Find sum of the series 1 - n+  n2 - n3 ... M terms 0<=N<=5, 1<=M<=25

import java.util.*;
public class Series{
    public static void main(String[] args){
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.print("Enter the value of m: ");
        m = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i <= m; i++){
            if (i % 2 != 0){
                sum -= (int)Math.pow(n, i);
            }
            else{
                sum += (int)Math.pow(n, i);
            }
        }
        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}