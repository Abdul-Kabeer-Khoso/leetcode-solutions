// Removing the duplicates and put that in lexicographical order

class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();

        // Track last occurrence of each character
        int[] lastIndex = new int[256];  // assuming ASCII
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i)] = i;
        }

        boolean[] inResult = new boolean[256]; // track if character is already in result

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If already in result, skip
            if (inResult[c]) continue;

            // Remove bigger letters at the end if they appear later
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c
                    && lastIndex[sb.charAt(sb.length() - 1)] > i) {
                inResult[sb.charAt(sb.length() - 1)] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            // Add current character
            sb.append(c);
            inResult[c] = true;
        }

        return sb.toString();
        
    }
}
