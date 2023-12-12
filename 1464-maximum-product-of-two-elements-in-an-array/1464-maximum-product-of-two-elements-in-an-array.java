class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int prod = (nums[len-1] - 1) * (nums[len-2] - 1);
        return prod;
    }
}