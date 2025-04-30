public class OddEven {
    public static void oddorEven(int n) {

        int bitMask = 1;
        // finding LSB;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("The number " + n + " is even");
        } else
            System.out.println("The number " + n + " is odd");

    }

    public static void main(String[] args) {
        oddorEven(3);
        oddorEven(5);
        oddorEven(4);
    }
}
