class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int operations = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != (i % 2 == 0 ? '0' : '1')) {
                operations++;
            }
        }

        return Math.min(operations, n - operations);
    }
}
