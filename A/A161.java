import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Integer, Integer> alphaMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        int MAX_VALUE = 101;

        for (int i = 0; i < 26; i++) {
            alphaMap.put(i, 101);
        }

        for (String key : keymap){
            for (int i = 0 ; i < key.length() ; i++){
                char c = key.charAt(i);
                int index = i + 1;
                int int_char = (int) c - 'A';
                if (alphaMap.get(int_char) > index){
                    alphaMap.put(int_char, index);
                }
            }
        }

        for (String target : targets){
            int count = 0;
            for (char c : target.toCharArray()){
                int value = alphaMap.get((int) c - 'A');
                if (value == 101){
                    count = -1;
                    break;
                }
                count += value;
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}