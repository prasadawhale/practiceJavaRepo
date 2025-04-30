public class printsubarrays {

    public static void printSubArrays(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(Array[k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }

}
