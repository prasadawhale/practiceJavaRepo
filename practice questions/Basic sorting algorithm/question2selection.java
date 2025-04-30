public class question2selection {

    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        int i, j, k;
        // turns n-1
        for (i = 0; i < n - 1; i++) {
            // inner loop to compare and check if arr[j]<arr[k] then k=j; // ">" for
            // descending
            // if above fails swap arr[i] and arr[k]
            for (j = k = i; j < n; j++) {
                if (arr[j] > arr[k]) {
                    k = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        SelectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
