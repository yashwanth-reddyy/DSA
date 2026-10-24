class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        if(x%10==0){
           return false;
        }
        int sum =0;
        int h=x;
        while(x>0){
            int n=x%10;
            sum*=10;
            sum+=n;
            x/=10;
        }
        System.out.println(h);
        System.out.println(sum);
        return h==sum;
    }
}