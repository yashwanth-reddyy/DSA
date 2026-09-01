class Solution {
    public int maxAreaOfIsland(int[][] grid) {
    
        int min=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int ans=dfs(grid,i,j);
                    min=Math.max(min,ans+1);
                }
            }
        }
        return min==Integer.MIN_VALUE?0:min;
    }
    public  int dfs(int grid[][],int i,int j){
        if(i>=grid.length||i<0){
            return 0;
        }
        if(j>=grid[0].length||j<0){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int right=0;
        if((i-1<grid.length&&i-1>=0)&&grid[i-1][j]==1){
           right=1+dfs(grid,i-1,j);
        }
        int left=0;
        if((i+1<grid.length&&i+1>=0)&&grid[i+1][j]==1){
            left=1+dfs(grid,i+1,j);
        }
        int top=0;
        if((j-1<grid[0].length&&j-1>=0)&&grid[i][j-1]==1){
            top=1+dfs(grid,i,j-1);
        }
        int bottom=0;
        if((j+1<grid[0].length&&j+1>=0)&&grid[i][j+1]==1){
            bottom=1+dfs(grid,i,j+1);
        }
        return top+left+bottom+right;
}
}