
// Question3:WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)
// Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,
// 121isapalindromebecausethereverseof121is121itself.
// Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321
import java.util.*;

public class palindrome {
    public static String isPalindrome(int n) {
        int mynum = n;
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println("reverse of given number: " + reverse);
        if (reverse == mynum) {
            return "Palindrome";
        } else {
            return "Not a Palindrome";
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked as a palindrome: ");
        int a = sc.nextInt();
        System.out.println("Given number is " + isPalindrome(a));
        int b = 10;
        System.out.print(b-- * b--);
        if (1 + 1 + 1 + 1 + 1 == 5) {
            System.out.print("TRUE");
        }
    }

}
