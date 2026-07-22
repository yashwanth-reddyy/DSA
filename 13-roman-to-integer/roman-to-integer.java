class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> x = new HashMap<>();
        x.put('I',1);
        x.put('V',5);
        x.put('X',10);
        x.put('L',50);
        x.put('C',100);
        x.put('D',500);
        x.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=x.get(s.charAt(i));
            if(i>0){
            if(((s.charAt(i)=='V')||(s.charAt(i)=='X'))&&s.charAt(i-1)=='I'){
                ans-=2;
            }
            if(((s.charAt(i)=='L')||(s.charAt(i)=='C'))&&s.charAt(i-1)=='X'){
                ans-=20;
            }
             if(((s.charAt(i)=='D')||(s.charAt(i)=='M'))&&s.charAt(i-1)=='C'){
                ans-=200;
            }
            }
        }
        return ans;
        
    }
}