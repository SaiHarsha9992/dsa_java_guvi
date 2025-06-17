import java.util.Scanner;

public class StringRotation{
    private static String inputString;
    private static String rotatedString;
    private static String tempString;
    
    public static void isRotation(){
        tempString = rotatedString + rotatedString;

        if(tempString.contains(inputString)){
            System.out.println(1);
        } else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        inputString = scanner.nextLine();
        System.out.print("Enter the rotated string: ");
        rotatedString = scanner.nextLine();
        isRotation();
        scanner.close();
    }
}