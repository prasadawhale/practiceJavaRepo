public class pairsinArray {

    public static void PairsArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PairsArray(arr);
    }

}
