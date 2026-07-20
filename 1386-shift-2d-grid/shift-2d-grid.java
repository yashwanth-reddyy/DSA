class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> y = new ArrayList<>();
        int m=grid.length;
        int n =grid[0].length;
        int m1[][]=new int[m][n];
        int w=0;
        int p=m*n-1;
        k=k%(m * n);
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
               int sum =w+k;
               if(sum>p){
                sum=sum-p-1;
                m1[sum/n][sum%n]=grid[i][j];
               }
               else{
               m1[sum/n][sum%n]=grid[i][j];
               }
               w++;
            }
        }
        for(int arr[]:m1){
            List<Integer> y1 = new ArrayList<>();
            for(int i =0;i<arr.length;i++){
                y1.add(arr[i]);
            }
            y.add(y1);
        }
        return y;
    }
}