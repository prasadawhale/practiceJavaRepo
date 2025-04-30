
// Question 1 :Write a Java method to compute the averageof three numbers
import java.util.*;

public class averagethreenum {

    public static double avg(int x, int y, int z) {
        double average = (double) (x + y + z) / 3;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(avg(a, b, c));
    }
}