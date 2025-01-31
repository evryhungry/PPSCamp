import java.util.Arrays;
// K번째 수
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0 ; i < commands.length; i++){
            int[] copyToArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copyToArray);
            answer[i] = copyToArray[commands[i][2] - 1];
        }
        return answer;
    }
}