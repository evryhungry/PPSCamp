// A009 문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        boolean answer = true;
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                answer = false;
                break;
            }
        }
        return answer;
    }
}