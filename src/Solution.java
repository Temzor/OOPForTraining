public class Solution {
    public static int[] findErrorNums(int[] nums) {
        int[] two = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ((nums[i]) + 1)) {
                two[0] = nums[i];
                two[1] = nums[i+1];
            }
        }
        return two;
    }
}