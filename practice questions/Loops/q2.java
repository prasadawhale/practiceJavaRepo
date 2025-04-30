import java.util.*;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to input: ");
        int n = sc.nextInt();
        System.out.print("Give numbers to be printed: ");

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                sumEven += a;
            } else {
                sumOdd += a;
            }

        }
        System.out.print("Sum of even numbers entered is : " + sumEven + "\n");
        System.out.print("Sum of odd numbers entered is : " + sumOdd);
    }

}
