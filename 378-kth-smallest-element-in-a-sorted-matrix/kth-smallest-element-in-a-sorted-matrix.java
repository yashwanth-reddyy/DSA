class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> x= new PriorityQueue<>();
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                x.add(matrix[i][j]);
            }
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=x.poll();
        }
        return arr[arr.length-1];
    }
}