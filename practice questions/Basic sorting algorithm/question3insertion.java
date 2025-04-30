
public class question3insertion {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) { // for descending order make it <
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            // condtion false hui matlb jagah hai prev+1 me usme curr ko daldo
            arr[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        int array[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
