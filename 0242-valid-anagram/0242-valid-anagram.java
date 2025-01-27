class Solution {
    public boolean isAnagram(String s, String t) {
        
        // if the both the strings are of different length then no need to check further
        if(s.length() != t.length())
        {
            return false;
        }

        // creating the array to store the frequency
        int freq [] =  new int[26];

        for(int i  = 0; i < s.length(); i++)
        {
              freq[s.charAt(i) - 'a']++; 

               // 'a' is the first letter of the alphabet, and its ASCII value is 97. 
              // Subtracting 'a' from any lowercase letter gives a zero-based index for that letter.

              freq[t.charAt(i) - 'a']--;

            //   If s.charAt(i) is 'z':
            //  'z' - 'a' = 25 → Updates count[25] (last position).
        }


    //    This loop checks whether all values in the count array are zero.
    // If any value is non-zero, it means s and t do not have the same characters in the same frequency, and the function returns false.

        for(int value :  freq)
        {
            if(value != 0)
            {
                return false;
            }
        }

        return true;

        


    }
}