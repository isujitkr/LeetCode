class Solution {
    public int numberOfMatches(int n) {
        int countMatch = 0;

        while (n > 1) {
            int match;
            if (n % 2 == 0) {
                match = n / 2;
            } else {
                match = (n - 1) / 2;
            }
            countMatch += match;
            n = (n % 2 == 0) ? n / 2 : (n - 1) / 2 + 1;
        }

        return countMatch;
    }
}
