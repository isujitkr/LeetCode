class Solution {
    public int[] twoSum(int[] nums, int target) {

    //1st method
    //    int[] arr=new int[2];
    //    for(int i=0;i<nums.length;i++){
    //        for(int j=i+1;j<nums.length;j++){
    //            if(nums[i]+nums[j]==target){
    //                arr[0]=i;
    //                arr[1]=j;
    //            }
    //        }
    //    } 
    //    return arr;

    // 2nd method

        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1};

        for(int j = 0; j < nums.length; j++){
            int rem = target - nums[j];
            if(mp.containsKey(rem)){
                ans = new int[]{j, mp.get(rem)};
                return ans;
            }

            mp.put(nums[j], j);
        }

        return ans;

    }
}