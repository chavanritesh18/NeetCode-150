class MinStack {

    // Stack to store all elements
    Stack<Integer> st; 
    
    // Stack to store the minimum values
    Stack<Integer> minStack;

    // Constructor initializes both stacks
    public MinStack() {
        st  = new Stack<>();  // Standard stack for normal operations
        minStack =  new Stack<>();  // Min stack to track the minimum element
    }
    
    // Pushes the value onto the main stack and updates the min stack if needed
    public void push(int val) {
        st.push(val);  // Push the value to the main stack
        
        // If the min stack is empty or the value is less than or equal to the current minimum, push it onto the min stack
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    // Pops the top value from the main stack and updates the min stack if the popped value was the minimum
    public void pop() {
        if(st.isEmpty()) return;  // If the main stack is empty, nothing to pop
        
        int top = st.pop();  // Pop the top element from the main stack
        
        // If the popped element is the same as the top of the min stack, pop it from the min stack as well
        if(top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    // Returns the top element of the main stack without removing it
    public int top() {
        return st.peek();  // Return the top element of the main stack
    }
    
    // Returns the current minimum value from the min stack
    public int getMin() {
        return minStack.peek();  // The top of the min stack is always the minimum value
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
