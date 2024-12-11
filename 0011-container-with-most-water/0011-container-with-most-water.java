class Solution {
    public int maxArea(int[] height) {
        //method 1 but it exceeds time limit

        // int n =  height.length;
        // int currArea, maxArea = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(height[i] < height[j]){
        //             currArea = height[i] * (j - i);
        //         }
        //         else{
        //             currArea = height[j] * (j - i);
        //         }

        //         maxArea = Math.max(currArea, maxArea);
        //     }
        // }

        // return maxArea;

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int currArea = 0;
        int maxArea = 0;

        while(left < right){
            if(height[left] < height[right]){
                currArea = height[left] * (right - left);
                left++;
            }
            else{
                currArea = height[right] * (right - left);
                right--;
            }

            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
        
    }
}