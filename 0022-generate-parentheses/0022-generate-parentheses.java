class Solution {
   
   // Helper function for backtracking
   private void backtrack(int openN, int closedN, int n, List<String> al, StringBuilder st) {
      // Base case: If the number of open and closed parentheses both reach 'n', add the valid combination to the list
      if (openN == closedN && openN == n) {
        al.add(st.toString());
        return;
      }

      // Recursive case: Add an open parenthesis if we haven't reached the limit 'n'
      if (openN < n) {
        st.append('('); // Add '('
        backtrack(openN + 1, closedN, n, al, st); // Recur with increased open count
        st.deleteCharAt(st.length() - 1); // Backtrack (remove last character)
      }

      // Recursive case: Add a closed parenthesis if there are more open parentheses that need closing
      if (closedN < openN) {
         st.append(')'); // Add ')'
         backtrack(openN, closedN + 1, n, al, st); // Recur with increased closed count
         st.deleteCharAt(st.length() - 1); // Backtrack (remove last character)
      }
   }

   // Main function to generate all valid parentheses combinations
   public List<String> generateParenthesis(int n) {
       List<String> al = new ArrayList<>(); // List to store valid combinations
       StringBuilder st = new StringBuilder(); // StringBuilder to build the current combination
       backtrack(0, 0, n, al, st); // Start backtracking with 0 open and closed parentheses
       return al; // Return the list of valid parentheses combinations
   }
}
