// Multiply String

import java.util.ArrayList;
import java.util.List;

class Solution {
    private String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

    while (i >= 0 || j >= 0 || carry > 0) {
        int x = i >= 0 ? num1.charAt(i--) - '0' : 0;
        int y = j >= 0 ? num2.charAt(j--) - '0' : 0;
        int sum = x + y + carry;
        sb.append(sum % 10);
        carry = sum / 10;
    }

    return sb.reverse().toString();
    }
    
    
    public String multiply(String num1, String num2) {
    
        int carry = 0;
        int write = 0;
        StringBuilder mpVar = new StringBuilder("");
        StringBuilder mpAns = new StringBuilder("");
        List<StringBuilder> sbList = new ArrayList<>();
    
        for(int i=0;i<num2.length();i++){
            for(int j=0;j<num1.length();j++){
                int a,b,addNum;
                a=num1.charAt(num1.length()-(j+1))-'0';
                b=num2.charAt(num2.length()-(i+1))-'0';
        
                mpVar = new StringBuilder(String.valueOf((a*b)+carry));
                carry = 0;
                
                if(j==num1.length()-1){
                    if (mpVar.length() == 2) {
                    write = mpVar.charAt(1) - '0';  // last digit
                    carry = mpVar.charAt(0) - '0';  // first digit
                    } else {
                    write = mpVar.charAt(0) - '0';
                    carry = 0;
                    }
                    mpAns.append(write);
                    break;
                }
                
                if(mpVar.length()==2){
                    write = mpVar.charAt(1)-'0';
                    carry = mpVar.charAt(0)-'0';
                } else{
                    write = mpVar.charAt(0)-'0';
                }
                mpAns.append(write);
            }
            if (carry > 0) {
            mpAns.append(carry);
            carry = 0;
            }
            mpAns.reverse();
            if(i>0){
                for(int a=0;a<i;a++){
                    mpAns.append("0");
                }
            }
            sbList.add(new StringBuilder(mpAns));
            mpAns.setLength(0);
        }
        String result = "0";
        for (StringBuilder s : sbList) {
        result = addStrings(result, s.toString());
        }
      
       int idx = 0;
        while (idx < result.length() - 1 && result.charAt(idx) == '0') {
            idx++;
        }
        result = result.substring(idx);
        
        return result;
           
    }
}