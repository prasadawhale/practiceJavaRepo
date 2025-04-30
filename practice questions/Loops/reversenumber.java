import java.util.Scanner;

public class reversenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shruti , Give number to be reversed: ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println("reversed number is: " + reverse);
    }

}
