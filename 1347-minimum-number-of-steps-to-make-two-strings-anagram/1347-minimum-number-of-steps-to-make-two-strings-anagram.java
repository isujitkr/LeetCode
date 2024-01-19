class Solution {
    public int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            throw new IllegalArgumentException("Input strings must have the same length");
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        int steps = 0;
        for (int count : charCount.values()) {
            steps += Math.abs(count);
        }

        return steps / 2;
    }
}