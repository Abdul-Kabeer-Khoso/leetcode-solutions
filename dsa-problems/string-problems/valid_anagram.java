// Valid Anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(t);
        
        boolean isAn = false;
        
        if(a.length()!=b.length()){
            return isAn;
        }
        
        outerloop:
        for(int i=0; i<a.length(); i++){
            for(int j=0;j<b.length(); j++){
                if(a.charAt(i)==b.charAt(j)){
                    b.deleteCharAt(j);
                    continue outerloop;
                }
            }
        }
          
        if(b.length()==0){
            isAn = true;
            return isAn;
        }else{
            return isAn;
        }
    }
}