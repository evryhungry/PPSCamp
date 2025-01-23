import java.util.HashSet;
// https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return Math.min(set.size(), nums.length / 2);
    }
}
