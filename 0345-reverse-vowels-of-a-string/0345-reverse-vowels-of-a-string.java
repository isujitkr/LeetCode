class Solution {

    private boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    public String reverseVowels(String s) {
        
        char[] charArray = s.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            while (left < right && !isVowel(charArray[left], vowels)) {
                left++;
            }
            while (left < right && !isVowel(charArray[right], vowels)) {
                right--;
            }
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}