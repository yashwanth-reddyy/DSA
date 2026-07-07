class Solution {
    public long sumAndMultiply(int n) {
        long ans=1;
        long sum =0;
        long digit=0;
        long base =0;
        while(n>0){
            int x=n%10;
            if(x>0){
                digit=digit+x*(int)Math.pow(10,base);
                base++;
            }
            sum+=x;
            n/=10;
        }
        ans=sum*digit;
        return ans;
        
    }
}