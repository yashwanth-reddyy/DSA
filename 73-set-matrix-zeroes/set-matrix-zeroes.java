class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows= new HashSet<>();
        HashSet<Integer> col= new HashSet<>();
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(!rows.contains(i)){
                        rows.add(i);
                    }
                    if(!col.contains(j)){
                        col.add(j);
                    }
                }
            }
        }
        for(int i :rows){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
         for(int i :col){
            for(int j =0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }
    }
}