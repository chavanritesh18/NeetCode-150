class Solution {
    public String clearDigits(String s) {
          Stack<Character> st =  new Stack<>();

        for(char ch  : s.toCharArray())
        {
            if(!st.isEmpty() && Character.isDigit(ch))
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }

        StringBuilder ans  =  new StringBuilder();

        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}