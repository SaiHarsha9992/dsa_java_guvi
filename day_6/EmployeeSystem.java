import java.util.Scanner;
public class EmployeeSystem{
    private static int numberOfSystems;
    private static boolean[] stateOfSystems;
    private static int totalLengthOfWire = 0;
    public static void findTheLengthOfWire(){
        for(int i = 0; i < numberOfSystems; i++){
            if(stateOfSystems[i] == false){
                totalLengthOfWire += 1;
            }
        }
        System.out.println("Total length of wire required: " + totalLengthOfWire + " meters");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of systems: ");
        numberOfSystems = scanner.nextInt();
        stateOfSystems = new boolean[numberOfSystems];
        System.out.println("Enter the state of each system (1 for working, 0 for not working):");
        for (int i = 0; i < numberOfSystems; i++) {
            stateOfSystems[i] = scanner.nextBoolean();
        }
        findTheLengthOfWire();
        scanner.close();
    }

}