import java.util.*;

public class maxnum {

    public static int maxNumber2Darray(int array[][]) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                maxNum = Math.max(maxNum, array[i][j]);
            }

        }
        return maxNum;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of 2d array: ");

        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        int m = matrix.length, n = matrix[0].length;

        System.out.println("Input " + row * column + " elements in the array: ");
        // taking input of 2d matrix array
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // printing the inputed array
        System.out.println("the given 2d array: ");
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maximum number from given array is: " + maxNumber2Darray(matrix));
        System.out.println(maxNumber2Darray(matrix));

    }

}
