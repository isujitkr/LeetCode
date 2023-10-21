class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];

        int n = nums.length;
        if(n < 1){
            return ans;
        }
        int prod = 1;
        for(int i = 0; i < n; i++){
            prod *=nums[i];
            ans[i] = prod;
        }

        prod = 1;
        for(int i = n-1; i > 0; --i){
            ans[i] = ans[i-1] * prod;
            prod *=nums[i];
        }
        ans[0] = prod;
        return ans;

    }
}