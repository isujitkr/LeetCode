class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(nums[i], max);
        }

        int[] bucket = new int[max + 1];

        for(int num : nums){
            bucket[num]++;
        }

        for(int i = 1; i < bucket.length; i++){
            bucket[i] += bucket[i - 1];
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = bucket[nums[i] - 1];
        }

        return ans;
    }
}