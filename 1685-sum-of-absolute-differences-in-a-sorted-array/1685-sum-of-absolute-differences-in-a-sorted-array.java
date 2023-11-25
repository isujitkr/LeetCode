class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int totalSum = 0;
        int[] ans = new int[n];

        for( int i = 0; i < n; i++){
            totalSum += nums[i]; 
        }

        for(int i = 0; i < n; i++){
            int valLeft = (nums[i] * i) - leftSum;
            int valRight = (totalSum - leftSum - nums[i] * (n-i));

            leftSum += nums[i];

            ans[i] = valLeft + valRight;
        }

        return ans;

    }
}