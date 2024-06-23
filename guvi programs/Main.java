import java.util.*;
public class Main {
    private static int inputN;
    private static LinkedList<Integer> listElements = new LinkedList<>();
    
    private static void findElementsZero(){
        int sum = 0;
        for (int element : listElements){
            sum += element;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       inputN = scanner.nextInt();
       for (int i = 0; i < inputN; i++){
           listElements.add(scanner.nextInt());
       }
       findElementsZero();
       scanner.close();
    }
}