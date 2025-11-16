// Find the difference between two strings

class Solution {
    public char findTheDifference(String s, String t) {  
         for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i)==t.charAt(j)){  
                    t = t.replaceFirst(t.charAt(j)+"", "");
                    break;
                }
            }
        }
        char c = t.charAt(0);
        return c;
    }
}