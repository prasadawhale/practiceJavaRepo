import java.util.*;

public class invertedpyramid {
    public static void inverted_half_pyramid(int n) {
        // outer loop for 0 to n rows or lines
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces and stars
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        inverted_half_pyramid(5);
    }
}
