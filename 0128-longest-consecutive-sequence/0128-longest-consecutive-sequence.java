class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }

        int maxStreak = 0;

        for(int ele : st){
            if(!st.contains(ele - 1)){
                int currNum = ele;
                int currStreak = 1;
                while(st.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }

                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
    }
}