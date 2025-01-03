class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int size =  q.size();

        while(size > 1){
            int x = q.remove();
            q.add(x);
            size--;
        }

        return q.remove();
    }
    
    public int top() {
        int size =  q.size();

        while(size > 1){
            int x = q.remove();
            q.add(x);
            size--;
        }

        int x = q.remove();
        q.add(x);
        return x;
    }
    
    public boolean empty() {
        if(q.size() == 0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */