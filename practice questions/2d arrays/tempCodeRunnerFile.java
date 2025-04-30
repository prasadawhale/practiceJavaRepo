class RicherCustomer {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // track max
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // reset sum for each customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            System.out.println("Sum of " + (i + 1) + "th customer is: " + sum);
            maxWealth = Math.max(maxWealth, sum); // update max
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        RicherCustomer obj = new RicherCustomer();
        int result = obj.maximumWealth(accounts);
        System.out.println("Maximum wealth is: " + result);
    }
}
