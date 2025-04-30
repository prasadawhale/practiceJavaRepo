public class diagonalsum {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        // outer loop from 0 to n-1 COmplexity O(n) if we write common two loops code we
        // will get O(n^2)
        for (int i = 0; i < n; i++) {

            // primary diagonal sum;
            sum += matrix[i][i]; // because primary diagonal have same coordinates (0,0),(1,1)etc

            // secondary diagonal sum
            if (i != n - 1 - i) { // condition to avoid adding common element twice
                sum += matrix[i][n - 1 - i]; // for secondary diagonal i+j = n-1
            }
        }
        return sum;

    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("Diagonal sum = " + diagonalSum(matrix));
    }
}
