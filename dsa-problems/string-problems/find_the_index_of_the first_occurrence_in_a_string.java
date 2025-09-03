// Find the Index of the First Occurrence in a String.

class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) return 0;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // first occurrence
            }
        }
        return -1;
    }
}
