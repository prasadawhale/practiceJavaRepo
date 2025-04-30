
import java.util.*;

public class isEven {
    public static Boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int a = sc.nextInt();
        System.out.println(isEven(a));

    }

}
