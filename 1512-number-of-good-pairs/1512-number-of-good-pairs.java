class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[102];

        for(int num : nums){
            freq[num]++;
        }

        int count = 0;

        for(int num : freq){
            count +=  num * (num - 1) / 2;
        }

        return count;
    }
}