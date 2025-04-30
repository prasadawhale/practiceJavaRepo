import java.util.*;

public class richestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            System.out.println("Sum of " + (i + 1) + "th customer is : " + sum);
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        richestCustomer obj = new richestCustomer();
        int result = obj.maximumWealth(accounts);
        System.out.println("Maximum wealth is: " + result);
        // maximumWealth(accounts);
    }
}
