class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        long left = 1; 
        long right = x;
        long result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int)mid;
            } else if (square < x) {
                left = mid + 1;
                result = mid; 
            } else {
                right = mid - 1;
            }
        }
        
        return (int)result;
    }
}