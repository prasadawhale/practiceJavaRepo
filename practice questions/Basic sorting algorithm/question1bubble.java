
public class question1bubble {

    public static void bubblesort(int arr[]) {
        int n = arr.length;
        // outer loop will be turns to check the array = n-1
        for (int i = 0; i < n - 1; i++) {

            // inner loop to check each element starting from 0 index and going till end
            // comparing adjacent indexes,
            // for each turn the bigger element will go to last,
            // so from turn no need to compare with last since already sorted
            // , so every time one comparison will be less
            // which is (n-1-i), because for every i i will get less
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // for descending order make it <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // printing the unsorted array
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }

            System.out.print(array[i] + " ");
            if (i == array.length - 1) {
                System.out.print("]");
            }
        }

        System.out.println();
        // System.out.println(array); wrong gives garbage value

        bubblesort(array);// calling function to do its work

        // printing the sorted array
        for (int k = 0; k < array.length; k++) {
            if (k == 0) {
                System.out.print("[");
            }

            System.out.print(array[k] + " ");

            if (k == array.length - 1) {
                System.out.println("]");
            }
        }

    }
}
