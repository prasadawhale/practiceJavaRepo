public class Question4 {

    public static boolean anagrams(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str1 = "races";
        String str2 = "cared";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.print(anagrams(str1, str2));
    }
}
