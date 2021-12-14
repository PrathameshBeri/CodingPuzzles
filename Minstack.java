class MinStack {

    List<Integer> back;
    Stack<Integer> st;
    int count = 0;
    public MinStack() {
       back  = new ArrayList<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        back.add(val);
        Collections.sort(back);
        count++;
    }
    
    public void pop() {
        int u = st.pop();
       back.remove((Object)u);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return back.get(0);
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