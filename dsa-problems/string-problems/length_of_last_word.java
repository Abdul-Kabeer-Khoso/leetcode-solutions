// Length of last word

class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        int lastWordLength = 0;
        boolean wordStart = false;
        for(int i=sb.length()-1;i>=0;i--){
            if(!wordStart){
                if(sb.charAt(i)==' '){
                    sb.deleteCharAt(i);
                } else{
                    wordStart=true;
                    break;
                }
            }
        }
        for(int j=sb.length()-1; j>=0; j--){
           if(sb.charAt(j)!=' '){
               lastWordLength++;
           } 
           else{
               return lastWordLength;
           }
        }
        
        return lastWordLength; }}