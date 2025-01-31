// https://school.programmers.co.kr/learn/courses/30/lessons/12916
// count 하나의 변수로 설정하여 문제를 풀어냈을 때,
class Solution {
    boolean solution(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') count++;
            else if (c == 'y') count--;
        }
        return count == 0;
    }
}