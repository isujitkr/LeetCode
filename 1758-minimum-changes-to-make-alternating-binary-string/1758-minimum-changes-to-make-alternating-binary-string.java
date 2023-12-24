class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int operationsWithStart0 = 0;
        int operationsWithStart1 = 0;

        // Check starting with '0'
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && s.charAt(i) != '0') {
                operationsWithStart0++;
            } else if (i % 2 == 1 && s.charAt(i) != '1') {
                operationsWithStart0++;
            }
        }

        // Check starting with '1'
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && s.charAt(i) != '1') {
                operationsWithStart1++;
            } else if (i % 2 == 1 && s.charAt(i) != '0') {
                operationsWithStart1++;
            }
        }

        return Math.min(operationsWithStart0, operationsWithStart1);
    }
}
