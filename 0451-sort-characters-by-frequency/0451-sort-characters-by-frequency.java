class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> charFreq = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        
        List<Character> sortedChars = new ArrayList<>(charFreq.keySet());
        
        Collections.sort(sortedChars, (a, b) -> charFreq.get(b) - charFreq.get(a));
        
        StringBuilder sortedString = new StringBuilder();
        for (char c : sortedChars) {
            int freq = charFreq.get(c);
            for (int i = 0; i < freq; i++) {
                sortedString.append(c);
            }
        }
        
        return sortedString.toString();
    }
}