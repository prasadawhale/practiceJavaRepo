public class allthreesorts {

    public static void bubblesort(int arr[]) {
        int n = arr.length;
        // outer loop will be turns to check the array = n-1
        for (int i = 0; i < n - 1; i++) {

            // inner loop to check each element starting from 0 index and going till end
            // comparing adjacent indexes,for each turn the bigger element will go to last,
            // so from turn no need to compare with last since already sorted so every time
            // one comparison will be less
            // which is (n-1-i), because for every i i will get less
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // for descending order make it <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printSortedArray(arr);

    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        // outer loop for considering the element to compare i=1, assuming 0th element
        // is sorted;
        for (int i = 1; i < n; i++) {

            // take current element as arr[i], and previous as i-1
            int curr = arr[i];
            int prev = i - 1;

            // write a loop to check if previous is >=0 and also prev>curr
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev]; // current ki place me previous ko store kiya
                prev--; // reduced prev to go till 0
            }

            // after above fails store value of current in arr[prev+1] since arr[prev] is <
            // curr or prev is -ve
            arr[prev + 1] = curr; // kyuki ek space abb blank hi hai jo hai [prev+1] so everytime save curr in
                                  // there
        }
        printSortedArray(arr);
    }

    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        int i, j, k;
        // turns n-1
        for (i = 0; i < n - 1; i++) {
            // inner loop to compare and check if arr[j]<arr[k] then k=j;
            // if above fails swap arr[i] and arr[k]
            for (j = k = i; j < n; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        printSortedArray(arr);
    }

    public static void printSortedArray(int arr[]) {
        // printing the sorted array
        for (int k = 0; k < arr.length; k++) {
            if (k == 0) {
                System.out.print("[");
            }

            System.out.print(arr[k] + " ");

            if (k == arr.length - 1) {
                System.out.println("]");
            }
        }

    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // printing the unsorted array
        System.out.println("Printing unsorted array: ");
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
        System.out.println("Printing bubble sorted array: ");
        bubblesort(array);// calling function to do its work

        System.out.println("Printing insertion sorted array: ");
        insertionSort(array);

        System.out.println("Printing selection sorted array: ");
        SelectionSort(array);

    }
}