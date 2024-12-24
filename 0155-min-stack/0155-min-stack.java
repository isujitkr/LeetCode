class MinStack {

    // Stack<Integer> st = new Stack<>();
    // Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    // public void push(int val) {
    //     if(st.size() == 0){
    //         st.push(val);
    //         min.push(val);
    //     }
    //     else{
    //         st.push(val);
    //         if(min.peek() <= val) min.push(min.peek());
    //         else min.push(val);

    //     }
    // }
    
    // public void pop() {
    //     st.pop();
    //     min.pop();
    // }
    
    // public int top() {
    //     return st.peek();
    // }
    
    // public int getMin() {
    //     return min.peek();
    // }


    //2nd method
    Stack<Long> st = new Stack<>();
    long min = -1;

    public void push(int val){
        long x = (long) val;
        if(st.size() == 0){
            st.push(x);
            min = x;
            return;
        }

        if(x < min){
            st.push( (2*x) - min);
            min = x;
        } 
        else st.push(x);
    }

    public void pop(){
        if(st.size() == 0) return;

        if(st.peek() >= min){
            st.pop();
        } 
        else{          
            // min -= st.peek(); 
            min = 2*min - st.peek(); //restore the old minimum
            st.pop();
        }
    }

    public int top(){
        if(st.size() == 0) return -1;

        long q = st.peek();
        if(q >= min){
            return (int)q;
        }
        return (int)min;
    }

    public int getMin(){
        if(st.size() == 0) return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */