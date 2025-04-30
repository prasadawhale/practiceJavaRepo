public class Que {

    public static void evendigit(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int evenDigit = arr[i] % 10;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && j > i) {

                    if (evenDigit == (arr[j] % 10)) {
                        System.out.println("[" + arr[i] + ", " + arr[j] + "]");

                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 6, 414, 12, 8, 9, 2, 18, 3, 46, 4, 59 };
        evendigit(arr);
    }
}
