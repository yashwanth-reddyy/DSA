class Solution {
    boolean b[][];
    public int numEnclaves(int[][] grid) {
    b=new boolean[grid.length][grid[0].length];
    for(int i =0;i<grid.length;i++){
        for(int j =0;j<grid[0].length;j++){
            if(!b[i][j]&&(grid[i][j]==1&&(i==0||j==0||i==grid.length-1||j==grid[0].length-1))){
                dfs(grid,i,j);
            }
        }
    }
    int count=0;
    for(int i =0;i<grid.length;i++){
        for(int j =0;j<grid[0].length;j++){
            if(!b[i][j]&&grid[i][j]==1){
                count++;
            }
        }
    }
    return count;
    }
    public void dfs(int grid[][],int i,int j){
        if(i<0||i>grid.length-1){
            return;
        }
        if(j<0||j>grid[0].length-1){
            return;
        }
        if(b[i][j]){
            return;
        }
        if(grid[i][j]==0){
            return;
        }
        b[i][j]=true;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}