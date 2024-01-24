class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] tails = new int[n];
        int len = 0;

        for (int num : nums) {
            int left = 0, right = len;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (tails[mid] < num) {
                    left = mid + 1;
                } 
                else {
                    right = mid;
                }
            }

            if (left == len) {
                tails[len++] = num;
            } 
            else {
                tails[left] = num;
            }
        }

        return len;
    }
}