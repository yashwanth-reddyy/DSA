class Solution {
    public int[][] generateMatrix(int n) {
       int mat[][]=new int[n][n];
       int count=0;
       int r1=0;
       int c1=n-1;
       int r2=0;
       int c2=n-1;
       int r3=n-1;
       int c3=0;
       int r4=n-1;
       int c4=0;
       int x=1;
       boolean b[][]=new boolean[n][n];
       while(count<n*n){
             for(int i =r1;i<=c1;i++){
                if(!b[r1][i]){
                    mat[r1][i]=x++;
                    b[r1][i]=true;
                    count++;
                }
             }
             for(int k=r2;k<=c2;k++){
                if(!b[k][c2]){
                    mat[k][c2]=x++;
                    b[k][c2]=true;
                    count++;
                }
             }
             for(int j =r3;j>=c3;j--){
                if(!b[r3][j]){
                    mat[r3][j]=x++;
                    b[r3][j]=true;
                    count++;
                }
             }
             for(int q =r4;q>=c4;q--){
                if(!b[q][c4]){
                    mat[q][c4]=x++;
                    b[q][c4]=true;
                    count++;
                }
             }
             r1+=1;
             c1-=1;
             r2+=1;
             c2-=1;
             r3-=1;
             c3+=1;
             r4-=1;
             c4+=1;
       }
        return mat;
      

        
    }
}