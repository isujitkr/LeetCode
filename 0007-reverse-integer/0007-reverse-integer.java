class Solution {
    public int reverse(int x) {
        int INT32_MAX = Integer.MAX_VALUE;
        int INT32_MIN = Integer.MIN_VALUE;

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > INT32_MAX / 10 || (rev == INT32_MAX / 10 && pop > 7)) {
                return 0;
            }
            if (rev < INT32_MIN / 10 || (rev == INT32_MIN / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }
}