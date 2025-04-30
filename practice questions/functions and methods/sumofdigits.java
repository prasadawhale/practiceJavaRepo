import java.util.*;

public class sumofdigits {

    public static int sumofDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find sum of all its digits: ");
        int a = sc.nextInt();
        System.out.println("sum of the given number " + a + " is: " + sumofDigits(a));

    }

}
