public class spiral {
    public static void printSpiral(int matrix[][]) {

        // initialize boundaries: startRow end row, start col end col
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        // now print boundaries going in and spiral ways, use while loop
        while (startRow <= endRow && startCol <= endCol) { // condition: to avoid skipping a row

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");

            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) { // last element needn't repeat .'. start+1
                System.out.print(matrix[i][endCol] + " ");

            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) { // two elements was repeating .'.last-1; first+1
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");

            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }

    }

    public static void main(String args[]) {

        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        printSpiral(matrix);

    }
}
