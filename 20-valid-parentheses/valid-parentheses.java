class Solution {
    public boolean isValid(String s) {
        Stack<Character> t = new Stack<>();
        for(int i =0;i<s.length();i++){
            if((!t.isEmpty()&&t.peek()=='(')&&s.charAt(i)==')'){
                t.pop();
            }
            else if((!t.isEmpty()&&t.peek()=='[')&&s.charAt(i)==']'){
                t.pop();
            }
            else if((!t.isEmpty()&&t.peek()=='{')&&s.charAt(i)=='}'){
                t.pop();
            }
            else{
                t.push(s.charAt(i));
            }
        }
        return t.isEmpty();
    }
}