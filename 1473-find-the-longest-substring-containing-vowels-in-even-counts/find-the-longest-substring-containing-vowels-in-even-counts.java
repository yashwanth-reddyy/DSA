class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<String,Integer> y= new HashMap<>();
        int arr[]=new int[5];
        String a=Arrays.toString(arr);
        y.put(a,-1);
        int length =0;
        for(int i =0;i<s.length();i++){
           if(s.charAt(i)=='a'){
           arr[0]=(arr[0]+1)%2;
           }
            if(s.charAt(i)=='e'){
            arr[1]=(arr[1]+1)%2;
           }
           if(s.charAt(i)=='i'){
            arr[2]=(arr[2]+1)%2;
           }
           if(s.charAt(i)=='o'){
            arr[3]=(arr[3]+1)%2;
           }
           if(s.charAt(i)=='u'){
            arr[4]=(arr[4]+1)%2;
           }
           String b =Arrays.toString(arr);
           if(y.containsKey(b)){
            length=Math.max(length,i-y.get(b));
           }
           else{
            y.put(b,i);
           }
        }
        return length;
    }
}