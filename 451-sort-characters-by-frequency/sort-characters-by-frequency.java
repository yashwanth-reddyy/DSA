class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> y = new HashMap<>();
       for(int i =0;i<s.length();i++){
        y.put(s.charAt(i),y.getOrDefault(s.charAt(i),0)+1);
       }
       HashSet<Integer> q= new HashSet<>();
       for(char a :y.keySet()){
           q.add(y.get(a));
       }
       int arr[]=new int[q.size()];
       int o=0;
       for(int i:q){
        arr[o]=i;
        o++;
       }
       Arrays.sort(arr);
       StringBuilder sb = new StringBuilder();
       int j =arr.length-1;
       while(sb.length()<s.length()){
        int max= arr[j];
            for(char a :y.keySet()){
              if(y.get(a)==max){
                for(int p =0;p<max;p++){
                    sb.append(a);
                }
              }
       }
        j--;
       }
       return sb.toString();
    }
}