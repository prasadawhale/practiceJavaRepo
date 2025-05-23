// Question 2:There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4 Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3Output:   -1 wisdomweneed123@gmail.com
// Example 3:Input:nums = [1], target = 0Output:   -1 Constraints:•1 <= nums . lengtth <= 5000 •-104 <= nums [ i ] <= 104•All values of nums are unique.•nums is an ascending array that is possibly rotated.•-104 <= target <= 104 

public class assign2 {
    public static int findTargetIndex(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int num2[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        System.out.println("Index of both targets are: ");
        System.out.println(findTargetIndex(nums, target));
        System.out.println(findTargetIndex(num2, target2));

    }
}
