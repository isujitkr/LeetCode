class Solution {
    public int maxProduct(int[] nums) {

        // First method

        // Arrays.sort(nums);
        // int len = nums.length;
        // int prod = (nums[len-1] - 1) * (nums[len-2] - 1);
        // return prod;

        
        //Second method
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                smax = max;
                max = nums[i];
            }
            else if (nums[i] > smax){
                smax = nums[i];
            }
        }

        return (max - 1) * (smax - 1);
    }
}