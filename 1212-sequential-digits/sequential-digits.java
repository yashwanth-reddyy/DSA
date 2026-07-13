class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> y = new ArrayList<>();
        helper(low,high,y);
        return y ;
    }
    public static  void helper(int low, int high,ArrayList<Integer> y ) {
        int n1=(int) Math.log10(Math.abs(low)) + 1;
         int n2=(int) Math.log10(Math.abs(high)) + 1;
         while(n1<=n2){
            StringBuilder sb = new StringBuilder();
            int x=n1;
            int i =1;
            while(x>0){
                sb.append(i);
                i++;
                x--;
            }
            if(i>10){
                return;
            }
            String t =sb.toString();
            int q=Integer.valueOf(t);
            if(q>=low&&q<=high){
            y.add(q);
            }
            while(i<=9){
                sb.deleteCharAt(0);
                sb.append(i);
                String w =sb.toString();
                int g=Integer.valueOf(w);
               if(g>=low&&g<=high){
            y.add(g);
            }
                i++;
            }
          n1++;
         }
         return;
    }

}