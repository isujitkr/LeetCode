class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayIncrement = 1;

        for (int i = 0; i < n; i++) {
            total += mondayIncrement + (i % 7);
            if ((i + 1) % 7 == 0) {
                mondayIncrement++;
            }
        }

        return total;
    }
}