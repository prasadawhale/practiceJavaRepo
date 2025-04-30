public class max_subarray_sum {
    public static void Max_SubArray_Sum(int Array[]) {

        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {

            for (int j = i; j < Array.length; j++) {
                current_sum = 0;
                for (int k = i; k <= j; k++) {
                    current_sum = current_sum + Array[k];

                }

                System.out.println(current_sum);
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
            }

        }
        System.out.println("Max Sub Array Sum is: " + max_sum);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Max_SubArray_Sum(arr);
    }

}
