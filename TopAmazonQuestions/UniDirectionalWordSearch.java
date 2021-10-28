class UniDirectionalWordSearch {
  public boolean solve(String[][] board, String word) {
    for (int i = 0; i < board.length; i++) {
      StringBuilder sbr = new StringBuilder();
      for (int j = 0; j < board[0].length; j++)
        sbr.append(board[i][j]);
      if (sbr.toString().contains(word))
        return true;
    }
    for (int i = 0; i < board[0].length; i++) {
      StringBuilder sbr = new StringBuilder();
      for (int j = 0; j < board.length; j++)
        sbr.append(board[j][i]);
      if (sbr.toString().contains(word))
        return true;
    }
    return false;
  }
}