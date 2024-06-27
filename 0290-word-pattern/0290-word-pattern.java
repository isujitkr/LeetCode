class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] arr = s.split(" ");
        char[] pat = pattern.toCharArray();
        
        if (pat.length != arr.length) {
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            if( !map.containsKey(pat[i])){

                if (map.containsValue(arr[i])) {
                    return false;
                }
                
                map.put(pat[i], arr[i]);
            }
            else{
                if (!map.get(pat[i]).equals(arr[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}