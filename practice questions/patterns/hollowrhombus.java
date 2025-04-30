
public class hollowrhombus {

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // inner space then hollow rectangle
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            // inner hollow rectangle
            for (int j = 1; j <= n; j++) {
                // inner stars and spaces

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // System.out.println();
    }

    public static void main(String args[]) {
        hollow_rhombus(5);
    }

}
