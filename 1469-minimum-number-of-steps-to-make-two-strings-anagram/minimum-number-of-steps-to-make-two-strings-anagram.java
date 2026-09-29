class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> q = new HashMap<>();
        for(int i =0;i<s.length();i++){
        q.put(s.charAt(i),q.getOrDefault(s.charAt(i),0)+1);
       }
       int count=0;
       for(int j =0;j<t.length();j++){
         if(q.containsKey(t.charAt(j))){
            q.put(t.charAt(j),q.get(t.charAt(j))-1);
            if(q.get(t.charAt(j))==0){
                q.remove(t.charAt(j));
            }
         }
         else{
            count++;
         }
       }
       return count;

    }
}