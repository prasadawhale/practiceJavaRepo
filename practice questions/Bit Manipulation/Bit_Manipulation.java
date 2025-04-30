public class Bit_Manipulation {

    public static void bitwiseOperators() {
        System.out.println(5 & 6);
        System.out.println(5 | 6); // or
        System.out.println(5 ^ 6); // 0 only if both are same 1^1 = 0
        System.out.println(~5); // negation or ones compliment
        System.out.println(5 << 2);// left shift
        System.out.println(6 >> 1);
    }

    public static int ithBit(int n, int i) {
        int bitMask = 1 << i;

        System.out.println(Integer.toBinaryString(n & bitMask)); // convert to binary

        if ((n & bitMask) == 0) { // comparing with 0 because other number can be anything
            // System.out.println("the " + i + "th bit of " + n + " is 1");
            return 0;
        } else {
            // System.out.println("the " + i + "th bit of " + n + " is 0");
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        // bitwiseOperators();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));// prints abcdefghijklmnopqrstuvwxyz}
        }
        System.out.println(ithBit(15, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(isPowerofTwo(10));
    }
}
