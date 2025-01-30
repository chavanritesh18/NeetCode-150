class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // HashMap to store the grouped anagrams
        HashMap<String , ArrayList<String>> hm  = new HashMap<>();

        // Iterate over all the string in the input array
        for(String str :  strs)
        {
            // character count array of size 26 to
            // store the frequency of each character
            int count [] =  new int[26];
            
            // fill the count array with the frequencies of 
            // characters in the string
            for(char c :  str.toCharArray())
            {
                count[c-'a']++;// the index corresponds to the letters position in the alphabet
            }
            
            // convert the count array to string to use as the hashmap key
            String key  = Arrays.toString(count);
            
            // if the key present in the hashmap , initialize a new list for that key
            if(!hm.containsKey(key))
            {
                hm.put(key , new ArrayList<>());
            }
            // add the current string to the list of the anagrams for that key
            hm.get(key).add(str);
        }

        // Return the values of the map, which are the grouped anagrams
        return new ArrayList<> (hm.values());
    }
}