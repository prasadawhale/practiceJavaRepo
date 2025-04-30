//Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23
public class question3 {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 12 }, { 4, 5, 6, 11 }, { 7, 8, 9, 10 } };
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }

    }

}
