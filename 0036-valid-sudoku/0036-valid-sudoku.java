class Solution {
    public boolean isValidSudoku(char[][] board) {

        // HashMaps to track numbers seen in each row, column, and 3x3 square
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> columns = new HashMap<>();
        HashMap<String, Set<Character>> sqrs = new HashMap<>();

        // Iterate through the 9x9 board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Ignore empty cells ('.')
                if (board[i][j] == '.') {
                    continue;
                }

                // Generate a unique key for the 3x3 square (each square is identified by its top-left corner)
                String sqrKey = (i / 3) + "," + (j / 3);

                // Check if the current number has already been seen in the respective row, column, or 3x3 square
                // computeIfAbsent initializes the set if it's not present and then tries to add the character.
                // If add() returns false, it means the number is a duplicate.
                if (!rows.computeIfAbsent(i, k -> new HashSet<>()).add(board[i][j]) ||  // Row check
                    !columns.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j]) ||  // Column check
                    !sqrs.computeIfAbsent(sqrKey, k -> new HashSet<>()).add(board[i][j])) { // Square check
                    return false;  // If any duplicate is found, return false immediately
                }
            }
        }

        // If no duplicates were found, the board is valid
        return true;
    }
}