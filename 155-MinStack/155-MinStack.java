// Last updated: 10/17/2025, 12:06:18 PM
class MinStack {
    Stack<Integer> st;
    Stack<Integer> stMin;
    public MinStack() {
        st = new Stack<>();
        stMin = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(stMin.isEmpty() || stMin.peek()>= val){
            stMin.push(val);
        }
    }
    
    public void pop() {
        int n = st.pop();
        if(n==stMin.peek()){
            stMin.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return stMin.peek();
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