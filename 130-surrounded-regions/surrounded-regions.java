class Solution {
    boolean b[][];
    public void solve(char[][] board) {
        b=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
               if((i==0||j==0||i==board.length-1||j==board[0].length-1)&&board[i][j]=='O'){
                helper(board,i,j);
               }
            }
        }
      for(int i=0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(b[i][j]){
                    board[i][j]='O';    
                }
                else{
                    board[i][j]='X';
                }
            }
      }
    }
    public void helper(char board[][],int i,int j){
        if(i<0||i>board.length-1){
            return;
        }
        if(j<0||j>board[0].length-1){
            return;
        }
        if(b[i][j]){
            return;
        }
        if(board[i][j]=='X'){
           return;
        }
        b[i][j]=true;
        helper(board,i+1,j);
        helper(board,i-1,j);
        helper(board,i,j+1);
        helper(board,i,j-1);
    }
}