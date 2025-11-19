// Isomorphic String Problem

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sToT = new int[256]; // stores mapping from s -> t
        int[] tToS = new int[256]; // stores mapping from t -> s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If mapping does not exist yet
            if (sToT[c1] == 0 && tToS[c2] == 0) {
                sToT[c1] = c2;
                tToS[c2] = c1;
            } else {
                // Existing mapping must match
                if (sToT[c1] != c2 || tToS[c2] != c1) return false;
            }
        }

        return true;
    }
}
