class Solution {
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for (int start = 0; start < n; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, n - 1);
            reverse(arr, left, right);
        }
        
        return new String(arr);
       
    }
}