class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int count=0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        int min=0;
        while(!queue.isEmpty()&&count>0){
          int size=queue.size();
                for(int k=0;k<size;k++){
                    int r[]=queue.poll();
                    int a=r[0];
                    int b=r[1];
                     if((a-1>-1&&a-1<grid.length)&&grid[a-1][b]==1){
                            grid[a-1][b]=2;
                             count--;
                            queue.add(new int[]{a-1,b});
                        }
                        if(a+1>-1&&a+1<grid.length&&grid[a+1][b]==1){
                            grid[a+1][b]=2;
                             count--;
                            queue.add(new int[]{a+1,b});
                        }
                        if((b+1>-1&&b+1<grid[0].length)&&grid[a][b+1]==1){
                            grid[a][b+1]=2;
                             count--;
                            queue.add(new int[]{a,b+1});
                        }
                        if((b-1>-1&&b-1<grid[0].length)&&grid[a][b-1]==1){
                          grid[a][b-1]=2;
                           count--;
                            queue.add(new int[]{a,b-1});
                        }
                }
                min++;
            }
           

        return count>0?-1:min;
    }
}