import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    
    Set blockSet = new HashSet<>();

    public boolean isValidSudoku(char[][] board){
        Set rowset = new HashSet<>();
        Set colset = new HashSet<>();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (colset.contains(board[i][j])){
                    return false;
                }
                if (rowset.contains(board[j][i])){
                    return false;
                }

                if(board[i][j] != '.'){
                    colset.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    rowset.add(board[j][i]);
                } 
            }
            rowset.clear();
            colset.clear();
        }

        int i = 0, j = 0;
        while(i < 9 && j < 9){
            while(i < 9){
                if(!isValid(board, i, j)){
                    return false;
                }
                i += 3;
                blockSet.clear();
            }
            i = 0;
            j += 3;
        }

        return true;
    }

    private boolean isValid(char[][] board, int i, int j){
        for (int x = i; x < i + 3; x++){
            for (int y = j; y < j + 3; y++) {
                if (blockSet.contains(board[x][y])){
                    return false;
                }
                if (board[x][y] != '.'){
                    blockSet.add(board[x][y]);
                }
            }
        }

        return true;
    }
}