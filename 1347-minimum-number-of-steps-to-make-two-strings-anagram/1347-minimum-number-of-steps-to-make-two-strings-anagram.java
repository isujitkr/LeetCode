class Solution {
    public int minSteps(String s, String t) {
        // if (s.length() != t.length()) {
        //     throw new IllegalArgumentException("Input strings must have the same length");
        // }

        // Map<Character, Integer> charCount = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        // }

        // for (char c : t.toCharArray()) {
        //     charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        // }

        // int steps = 0;
        // for (int count : charCount.values()) {
        //     steps += Math.abs(count);
        // }

        // return steps / 2;

        int arr[] = new int[26];
        int arr1[] = new int[26];

        for (char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }

        for (char ch : t.toCharArray()) {
            arr1[ch-'a']++;
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            ans += Math.abs(arr[i] - arr1[i]);
        }
        
        return ans/2;
    
    }
}