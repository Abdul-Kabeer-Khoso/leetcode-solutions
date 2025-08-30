// Valid palindrome solutions

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder mys = new StringBuilder(s);
        int len = mys.length();
        
        for(int i=0; i<len; i++){
            char ch = mys.charAt(i);
            if(Character.isUpperCase(ch)){
                mys.setCharAt(i, Character.toLowerCase(ch));
            }
        }
        
        String newString = mys.toString();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            char ch = newString.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        
        int left = 0;
        int right = sb.length()-1;
        
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}