class NumMatrix {
    int matrix[][];
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
        for(int i =0;i<matrix.length;i++){
            int sum =0;
            for(int j =0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
                matrix[i][j]=sum;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        while(row1<=row2){
            if(col1==0){
                 sum+=matrix[row1][col2];
            }
            else{
            sum+=matrix[row1][col2]-matrix[row1][col1-1];
            }
            row1++;
        }
        return sum;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */