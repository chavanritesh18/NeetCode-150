class Solution {
    public boolean isValid(String s) {
        
        // Stack to store opening brackets
        Stack<Character> st  =  new Stack<>();

        // Iterate through each character in the string
        for(char ch  : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else { // If it's a closing bracket
                // If stack is empty, there's no matching opening bracket
                if(st.isEmpty()) return false;

                // Pop the top element from the stack
                char top  = st.pop();

                // Check if the popped opening bracket matches the closing bracket
                if((ch == ')' && top != '(' ) ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }

        // If stack is empty, all brackets were matched correctly
        return st.isEmpty();
    }
}
