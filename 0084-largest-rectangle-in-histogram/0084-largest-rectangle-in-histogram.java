class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        //calculate nse[]
        st.push(n-1);
        nse[n-1] = n;

        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] =st.peek();
            }

            st.push(i);
        }

        //emptying stack
        while(!st.isEmpty()) st.pop();

        //calculate pse[]
        st.push(0);
        pse[0] = -1;

        for(int i = 1; i < n; i++){
            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] =st.peek();
            }

            st.push(i);
        }

        //maximum area of rectangle
        int max = -1;

        for(int i = 0; i < n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }

        return max;
    }
}