import java.util.Scanner;

public class XHollowSquareE{
    private static int size;
    private static int middleValue;
    private static XHollowSquareE hollowSquareE;


    private XHollowSquareE() {
        System.out.println("Hollow Square Object is created");
    }


    public static XHollowSquareE createHollowSquareE() {
        if (hollowSquareE == null) {
            hollowSquareE = new XHollowSquareE();
        }
        return hollowSquareE;
    }


    private static void XHollowSquare(int size) {
        middleValue = (int)Math.ceil(size / 2.0);
        System.out.println("Middle value: " + middleValue);
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == middleValue && j == middleValue) {
                    System.out.print("@ ");
                } 
                else if (j == i || j == size - i + 1 || i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the hollow square: ");
        size = scanner.nextInt();
        XHollowSquareE hollowSquareE = XHollowSquareE.createHollowSquareE();
        hollowSquareE.XHollowSquare(size);
        

        XHollowSquareE hollowSquareE2 = XHollowSquareE.createHollowSquareE();
        System.out.println("Hollow Square Object 2: " + hollowSquareE2);
        hollowSquareE2.XHollowSquare(size + 2);
        scanner.close();
    }
}