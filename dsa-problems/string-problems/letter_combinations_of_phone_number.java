// Letter combinations of phone numbers

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] phoneLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> codeLetter = new ArrayList<>();
        int len = digits.length();
        
        if (len == 0) {
            return result;
        }
        
        if(len==1){
            int index = digits.charAt(0)-'0';
            String phoneCode = phoneLetters[index];
            for(int a=0; a<=phoneCode.length()-1; a++){
                String val = String.valueOf(phoneCode.charAt(a));
                result.add(val);
            }
            return result;
        }

        for(int i = 0; i < len; i++) {
            int index = digits.charAt(i) - '0';
            String phoneCode = phoneLetters[index];
            if (!phoneCode.isEmpty()) { 
                codeLetter.add(phoneCode);
            }
        }
        
        if (codeLetter.size() == 2) {
            String first = codeLetter.get(0);
            String second = codeLetter.get(1);
            for (int a = 0; a < first.length(); a++) {
                for (int b = 0; b < second.length(); b++) {
                    result.add("" + first.charAt(a) + second.charAt(b));
                }
            }
        } else if (codeLetter.size() == 3) {
            String first = codeLetter.get(0);
            String second = codeLetter.get(1);
            String third = codeLetter.get(2);
            for (int a = 0; a < first.length(); a++) {
                for (int b = 0; b < second.length(); b++) {
                    for (int c = 0; c < third.length(); c++) {
                        result.add("" + first.charAt(a) + second.charAt(b) + third.charAt(c));
                    }
                }
            }
        } else if (codeLetter.size() == 4) {
            String first = codeLetter.get(0);
            String second = codeLetter.get(1);
            String third = codeLetter.get(2);
            String fourth = codeLetter.get(3);
            for (int a = 0; a < first.length(); a++) {
                for (int b = 0; b < second.length(); b++) {
                    for (int c = 0; c < third.length(); c++) {
                        for (int d = 0; d < fourth.length(); d++) {
                            result.add("" + first.charAt(a) + second.charAt(b) + third.charAt(c) + fourth.charAt(d));
                        }
                    }
                }
            }
        }
        return result;
    }
}