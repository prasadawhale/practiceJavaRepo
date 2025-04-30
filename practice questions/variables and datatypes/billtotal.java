import java.util.*;

public class billtotal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price of a Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter Price of a Pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter Price of a Erase: ");
        float eraser = sc.nextFloat();
        float sum = (pencil + pen + eraser);
        System.out.println("total bill is: " + sum);
        float gstbill = sum + 0.18f * sum;
        System.out.println("Bill with GST is: " + gstbill);
    }
}
