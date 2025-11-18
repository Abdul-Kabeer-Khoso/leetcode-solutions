// Reverse words in a String

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder rsb = new StringBuilder();
        int space = 0;
        boolean wordStart = false;
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
               sb.append(s.charAt(i));
               space = 0;
               wordStart= true;
            }
            
            if((i==0 || s.charAt(i)==' ') && space<1 && wordStart==true){
                space++;
                sb.reverse();
                rsb.append(sb);
                sb.setLength(0);
                if(i!=0){
                    rsb.append(' ');
                }
            }
        }
        for(int j=rsb.length()-1; j>=0; j--){
            if(rsb.charAt(j) == ' '){
                rsb.deleteCharAt(j);
            }else{
                break;
            }
        }
        return rsb.toString();
    }
}