// A134 Reverse Prefix of Word
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0, idx+1)).reverse();
        return sb.toString()+word.substring(idx+1);
    }
}