class Solution {

    public int minIndex(int[] nums){
        int min = nums[0];
        int idx = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                idx = i;
            }
        }

        return idx;
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int i = 1; i <= k; i++){
            int minIdx= minIndex(nums);
            nums[minIdx] *= multiplier;
        }

        return nums;
    }
}