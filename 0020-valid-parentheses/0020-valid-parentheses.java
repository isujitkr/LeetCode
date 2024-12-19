class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int n = s.length();

        if(n % 2 != 0) return false;

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(st.size() == 0) return false;
                else {
                    if(st.isEmpty()) return false;

                    char top = st.peek();
                    if ((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')) {
                        st.pop();
                    } 
                    else {
                        return false;
                    }
                }
            }
        }

        return st.isEmpty();
    }
}