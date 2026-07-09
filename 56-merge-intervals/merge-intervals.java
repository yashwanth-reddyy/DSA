class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
     List<int[]>y = new ArrayList<>();
     int start =intervals[0][0];
     int end=intervals[0][1];
     int ans[]=new int[2];
     ans[0]=start;
     ans[1]=end;
     y.add(ans);
     for(int i =1;i<intervals.length;i++){
       int start1 =intervals[i][0];
       int end1=intervals[i][1];
       if(start1<=end){
            int u =start>=start1?start1:start;
            int p=end1>=end?end1:end;
            y.get(y.size()-1)[1]=p;
           start=u;
           end=p;
       }
       else{
        int ans1[]=new int[2];
           ans1[0]=start1;
           ans1[1]=end1;
           y.add(ans1);
           start=start1;
           end=end1;
       }
     }
     int arr[][]=new int[y.size()][2];
    for(int k =0;k<y.size();k++){
        int arr2[]=y.get(k);
        arr[k][0]=arr2[0];
        arr[k][1]=arr2[1];
    }
    return arr;
    }
}