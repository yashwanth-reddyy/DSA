class NumMatrix {
    int matrix1[][];
    public NumMatrix(int[][] matrix) {
         int matrix1[][]=new int[matrix.length+1][matrix[0].length+1];
         for(int i =1;i<matrix1.length;i++){
            for(int j =1;j<matrix1[0].length;j++){
                matrix1[i][j]=matrix1[i-1][j]+matrix1[i][j-1]+matrix[i-1][j-1]-matrix1[i-1][j-1];
             }
         }
         this.matrix1=matrix1;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        return matrix1[row2][col2]-matrix1[row1-1][col2]-matrix1[row2][col1-1]+matrix1[row1-1][col1-1];

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */