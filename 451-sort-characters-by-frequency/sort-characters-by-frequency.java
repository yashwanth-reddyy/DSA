class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> y = new HashMap<>();
       for(int i =0;i<s.length();i++){
        y.put(s.charAt(i),y.getOrDefault(s.charAt(i),0)+1);
       }
       List<Character> e[]=new ArrayList[s.length()+1];
       for(char a:y.keySet()){
        int u =y.get(a);
        if(e[u]==null){
            e[u]=new ArrayList<>();
        }
        e[u].add(a);
       }
       StringBuilder sb = new StringBuilder();
       for(int h =e.length-1;h>=0;h--){
           if(e[h]!=null){
            for(char a:e[h]){
                for(int l=0;l<h;l++){
                    sb.append(a);
                }
            }
           }
       }
       return sb.toString();

    }
}