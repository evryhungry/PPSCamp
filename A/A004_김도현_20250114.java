import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12910
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(a -> a % divisor == 0)
                .sorted()
                .toArray();
        return answer.length > 0 ? answer : new int[] {-1};
    }
}