public class SearchSortedMatrix {

    public static void print(int i, int j, int key, boolean search) {
        if (search == false) {
            System.out.println("The element " + key + " Not Found in given array.");
        } else
            System.out.println("The element " + key + " Found at : (" + i + "," + j + ")");

    }

    public static boolean searchSortedmatrix(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;
        int i = n - 1;
        int j = 0;

        // from top right corner O(n+m)
        // while (i <= n - 1 && j >= 0) {
        // if (matrix[i][j] == key) {
        // print(i, j, key);
        // return true;
        // } else if (key < matrix[i][j]) {
        // j--;
        // } else if (key > matrix[i][j]) {
        // i++;
        // }
        // }

        // from bottom left corner i=n-1 to 0; j=0 to m-1
        while (i >= 0 && j <= m - 1) {
            if (matrix[i][j] == key) {
                print(i, j, key, true);
                return true;
            } else if (key < matrix[i][j]) {
                i--;
            } else if (key > matrix[i][j]) {
                j++;
            }
        }
        boolean search = false;
        print(i, j, key, search);
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 13;
        searchSortedmatrix(matrix, key);
    }
}
