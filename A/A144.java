class Solution {
    public int solution(String word) {
        String vowels = "AEIOU";
        int[] weights = {781, 156, 31, 6, 1};
        int result = word.length();

        for (int i = 0; i < word.length(); i++) {
            result += vowels.indexOf(word.charAt(i)) * weights[i];
        }

        return result;
    }
}
