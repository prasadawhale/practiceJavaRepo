public class assign5 {

    public static int[] printTriplet(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int a = nums[i];
                        int b = nums[j];
                        int c = nums[k];

                        return new int[] { a, b, c };
                    }
                }
            }
        }
        return new int[] {};

    }

    public static void main(String args[]) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(printTriplet(nums));

    }

}
