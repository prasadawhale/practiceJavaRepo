
public class palindrome {

    public static boolean isPalindrome(String str) {

        // run a loop from 0 to half of string length because we dont need to compare
        // evry element with everything
        // just compare start with end start +1 end -1 like that thats why deviding in
        // mid bcoz last comparison will be middle
        int n = str.length();
        for (int i = 0; i < n / 2; i++) { // O(n)
            if (str.charAt(i) != str.charAt(n - 1 - i)) { // if a single element is not matched then it will return
                                                          // false
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str = "raceecar";// "RacecaR";
        System.out.println(isPalindrome(str));

    }

}
