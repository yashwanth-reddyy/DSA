class Solution {
    int sum=0;
    public int numIslands(char[][] grid) {
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    sum++;
                    helper(grid,i,j);
                }
            }
        }
        return sum;
    }
    public void helper(char[][] grid,int i ,int j){
        if(i<0||i>=grid.length){
            return;
        }
        if(j<0||j>=grid[0].length){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        if(grid[i][j]=='1'){
           grid[i][j]='0';
        }
        helper(grid,i+1,j);
        helper(grid,i,j+1);
        helper(grid,i-1,j);
        helper(grid,i,j-1);
    }
}