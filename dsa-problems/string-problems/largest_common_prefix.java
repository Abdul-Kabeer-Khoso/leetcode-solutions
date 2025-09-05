// Larget common prefix

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int lengthOfShortestString = -2;
        for(String myStr : strs){
            if(lengthOfShortestString==-2){
                lengthOfShortestString=myStr.length();
            } else{
                if(myStr.length()<lengthOfShortestString){
                    lengthOfShortestString = myStr.length();
                }
            }
            
        }
        
        List<StringBuilder> mySl = new ArrayList<>();
        
        for(int i=0;i<lengthOfShortestString;i++){
           for(int j=0;j<strs.length;j++){
               
               if(mySl.size()<=i){
                   mySl.add(new StringBuilder());
               }
               mySl.get(i).append(strs[j].charAt(i));
           }
        }
        
        StringBuilder sb = new StringBuilder("");
        char ch = 'e';
        
        for(StringBuilder str : mySl){
            for(int k=0;k<str.length();k++){
                if(ch=='e'){
                    ch=str.charAt(k);
                } else{
                    if(k>0 && str.charAt(k)!=ch){
                        return sb.toString();
                    }
                }
                
                if(k==str.length()-1){
                    sb.append(str.charAt(k));
                }
            }
            ch='e';
        }
        return sb.toString();
    }
    
}