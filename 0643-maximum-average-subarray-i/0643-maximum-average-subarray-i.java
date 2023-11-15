class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAverage = (double) sum / k;

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k]; 
            double average = (double) sum / k;
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}