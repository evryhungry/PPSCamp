import java.util.*;

// 0130 - 0210
class Solution {
    public int[] solution(int N, int[] stages) {
        if (N == 0) {
            return new int[0];
        }

        Map<Integer, Double> state = new HashMap<>();
        int sum = stages.length;


        for (int stage : stages) {
            if (stage == N + 1) continue;
            state.put(stage, state.getOrDefault(stage, 0.0) + 1f);
        }

        for (int i = 1 ; i <= N ; i++){
            Double value = state.get(i);
            int loss = (value != null) ? value.intValue() : 0;
            double loss_rate = (sum == 0) ? 0 : (double) loss / sum;
            state.put(i, loss_rate);
            sum -= loss;
        }

        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(state.entrySet());
        entryList.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        List<Integer> answer = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : entryList) { answer.add(entry.getKey()); }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}