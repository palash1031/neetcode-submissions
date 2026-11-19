class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char curr = board[i][j];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
            hs.clear();
        }
        hs.clear();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
            hs.clear();
        }
        hs.clear();

        //box tl
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tm
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tr
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tm
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tr
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tm
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        hs.clear();

        //tr
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                char curr = board[j][i];
                if (curr != '.' && !hs.add(curr)) {
                    return false;
                }
            }
        }
        return true;

    }
}
