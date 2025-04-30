
// "aaabbccccddddd"
// o/p"a3b2c4d5"
import java.util.*;

public class StringCompression {

    public static void stringCompression(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            Integer count = 1;
            // i should be less than n-1 be
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            // if count is increased then only append it with sb else take it as it is
            if (count > 1) {
                sb.append(str.charAt(i) + count.toString());
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String args[]) {
        String str = "aaabbcccc";
        stringCompression(str);

    }
}
