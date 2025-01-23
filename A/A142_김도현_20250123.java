import java.util.ArrayList;
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;
        for (int num : arr) {
            if (num != prev) {
                list.add(num);
                prev = num;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
