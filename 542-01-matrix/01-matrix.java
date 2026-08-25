class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]>t= new LinkedList<>();
        int count=0;
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    t.add(new int[]{i,j});
                }
                else{
                    count++;
                }
            }
        }
        boolean b[][]=new boolean[mat.length][mat[0].length];
        int ans=1;
        while(!t.isEmpty()&&count>0){
            int size=t.size();
            for(int i =0;i<size;i++){
                int e[]=t.poll();
                int start=e[0];
                int end=e[1];
                if((start-1>-1&&start-1<mat.length)&&(mat[start-1][end]==1&&!b[start-1][end])){
                    b[start-1][end]=true;
                    mat[start-1][end]=ans;
                    count--;
                    t.add(new int[]{start-1,end});
                }
                if((start+1>-1&&start+1<mat.length)&&(mat[start+1][end]==1&&!b[start+1][end])){
                    b[start+1][end]=true;
                    mat[start+1][end]=ans;
                    count--;
                    t.add(new int[]{start+1,end});
                }
                 if((end+1>-1&&end+1<mat[0].length)&&(mat[start][end+1]==1&&!b[start][end+1])){
                    b[start][end+1]=true;
                    mat[start][end+1]=ans;
                    count--;
                    t.add(new int[]{start,end+1});
                }
                 if((end-1>-1&&end-1<mat[0].length)&&(mat[start][end-1]==1&&!b[start][end-1])){
                    b[start][end-1]=true;
                    mat[start][end-1]=ans;
                    count--;
                    t.add(new int[]{start,end-1});
                }
            }
             ans++;
        }
        return mat;
    }
}