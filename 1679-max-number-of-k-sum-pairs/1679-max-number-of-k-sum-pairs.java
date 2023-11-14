class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int maxOperations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                maxOperations++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return maxOperations;
    }
}