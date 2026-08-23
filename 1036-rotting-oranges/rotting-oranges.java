class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int mat[][]=new int[grid.length][grid[0].length];
         int mat1[][]=new int[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        while(!queue.isEmpty()){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    mat1[i][j] = grid[i][j]; 
                }
            }
            Queue<int[]> pri=new LinkedList<>();
            int t[]=queue.poll();
            pri.add(t);
            int sum=0;
            while(!pri.isEmpty()){
                sum++;
                int size=pri.size();
                for(int k=0;k<size;k++){
                    int r[]=pri.poll();
                    int a=r[0];
                    int b=r[1];
                     if((a-1>-1&&a-1<grid.length)&&mat1[a-1][b]==1){
                            mat[a-1][b]=Math.min(mat[a-1][b],sum);
                            mat1[a-1][b]=2;
                            pri.add(new int[]{a-1,b});
                        }
                        if(a+1>-1&&a+1<grid.length&&mat1[a+1][b]==1){
                            mat[a+1][b]=Math.min(mat[a+1][b],sum);
                            mat1[a+1][b]=2;
                            pri.add(new int[]{a+1,b});
                        }
                        if((b+1>-1&&b+1<grid[0].length)&&mat1[a][b+1]==1){
                            mat[a][b+1]=Math.min(mat[a][b+1],sum);
                            mat1[a][b+1]=2;
                            pri.add(new int[]{a,b+1});
                        }
                        if((b-1>-1&&b-1<grid[0].length)&&mat1[a][b-1]==1){
                            mat[a][b-1]=Math.min(mat[a][b-1],sum);
                            mat1[a][b-1]=2;
                            pri.add(new int[]{a,b-1});
                        }
                }
            }
           

        }
        int ans=Integer.MIN_VALUE;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(mat[i][j]==Integer.MAX_VALUE){
                    return -1;
                }
                else{
                    ans=Math.max(ans,mat[i][j]);
                }
            }
        }
      return ans;
        

    }
}