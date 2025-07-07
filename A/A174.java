import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answerList = new ArrayList<>();
        PriorityQueue<Integer> HOF = new PriorityQueue<>();

        for (int i : score) {
            HOF.add(i);
            if (HOF.size() > k ){
                HOF.poll();
            }
            answerList.add(HOF.peek());
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}