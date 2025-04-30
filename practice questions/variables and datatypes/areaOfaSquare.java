import java.util.*;

public class areaOfaSquare {
    public static void main(String args[]) {
        System.out.println("Give Side: ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
    }

}
