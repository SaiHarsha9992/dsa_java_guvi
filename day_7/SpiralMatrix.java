import java.util.*;

public class SpiralMatrix{
    private static int inputN;
    private static int inputM;
    private static int[][] matrix;
    private static int[] resultArray;

    private static void readMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        inputN = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        inputM = scanner.nextInt();
        
        matrix = new int[inputN][inputM];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < inputN; i++) {
            for (int j = 0; j < inputM; j++) {
                matrix[i][j] = scanner.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(){
        int top = 0, bottom = inputN - 1;
        int left = 0, right = inputM - 1;
        resultArray = new int[inputN * inputM];
        int index = 0;
        while (top <= bottom && left <= right) {
        
            for (int i = left; i <= right; i++) {
                resultArray[index++] = matrix[top][i];
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                resultArray[index++] = matrix[i][right];
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    resultArray[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    resultArray[index++] = matrix[i][left];
                }
                left++;
            }
        }


        System.out.println(Arrays.toString(resultArray));
    }

    public static void main(String... args){
        readMatrix();
        printMatrix();
    }
}