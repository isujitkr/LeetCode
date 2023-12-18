class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int last = nums[n-1];
        int secLast = nums[n-2];

        return last * secLast - nums[0] * nums[1];
    }
}