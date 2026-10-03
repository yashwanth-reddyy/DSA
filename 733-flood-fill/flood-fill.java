class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void dfs(int image[][],int i,int j ,int color,int index){
        if(i>image.length-1||i<0){
            return;
        }
        if(j>image[0].length-1||j<0){
            return;
        }
        if(image[i][j]!=index){
            return;
        }
        if(image[i][j]==color){
            return;
        }
        image[i][j]=color;
        dfs(image,i+1,j,color,index);
        dfs(image,i,j+1,color,index);
        dfs(image,i-1,j,color,index);
        dfs(image,i,j-1,color,index);
         }
}