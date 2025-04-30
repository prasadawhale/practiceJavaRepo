
//Question1:Writea Java program to get anumberfrom theuser and print whether it is positive or negative

import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number.");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

}
