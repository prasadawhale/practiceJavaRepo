import java.util.*;

public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the year you want to check: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println(year + " YEAR IS LEAP.");
                } else {
                    System.out.println(year + " YEAR IS NOT A LEAP YEAR");
                }
            } else {
                System.out.println(year + " YEAR IS LEAP.");

            }
        }

        else {
            System.out.println(year + " YEAR IS NOT A LEAP YEAR");
        }
    }

}
