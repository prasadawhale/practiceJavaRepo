
public class insertion {

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
    }

    public static void main(String args[]) {
        int array[] = { 5, 4, 1, 3, 2 };
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
