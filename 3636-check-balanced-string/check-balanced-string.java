class Solution {
    public boolean isBalanced(String num) {
        int sum =0;
        int sum1=0;
        for(int i =0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            if(i%2==0){
                sum+=a;
            }
            else{
                sum1+=a;
            }
        }
        return sum==sum1;
    }
}