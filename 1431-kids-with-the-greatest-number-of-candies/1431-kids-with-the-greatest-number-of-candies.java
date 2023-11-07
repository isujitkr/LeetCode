class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        int n = candies.length;       
        // Find the maximum number of candies among all kids
        for(int i = 0; i < n; i++){
            maxCandies = Math.max(maxCandies, candies[i]);
        } 

        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            result.add(candies[i] + extraCandies >= maxCandies);
        } 
           
        return result;
    }
}