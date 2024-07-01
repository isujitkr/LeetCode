class Solution {
    public String toLowerCase(String s) {
        int n = s.length();

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                newString.append((char) (c + 32));
            }
            else{
                newString.append(c);
            }
        }

        return newString.toString();
    }
}