
public class linearsearch {
    public static int LinearSearch(String arr[], String a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        String menu[] = { "samosa", "chole", "pepsi", "vadapav" };
        String key = "vadapav";
        int index = LinearSearch(menu, key);
        if (index == -1)
            System.out.println("Key Not found");
        System.out.println("The key is at index: " + index);
        System.out.println("array length: " + menu.length);
    }
}
