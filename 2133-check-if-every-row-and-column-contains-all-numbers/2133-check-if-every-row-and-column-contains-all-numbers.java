class Solution {
    public boolean checkValid(int[][] matrix) {
        
        // calculating the length of the array
        int n  = matrix.length;

        // Iterating through the row
        for(int i  = 0; i < n; i++)
        {
            // Hashset to store the row elements
            HashSet<Integer> rowSet =  new HashSet<>();
            // Hashset to store the column elements
            HashSet<Integer> colSet =  new HashSet<>();
            // Iterating through the column elements
            for(int j  = 0; j < n; j++)
            {
                 
                //  Adding values into the set
                 rowSet.add(matrix[i][j]);
                 colSet.add(matrix[j][i]);
            }


             // check size if not same this means we got duplicate
             if(rowSet.size() != n || colSet.size() != n) return false;
        }
             // return true this means there is no duplicate values
             return true; 
        }

      
      

    }

