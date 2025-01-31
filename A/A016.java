import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int idx = 0;
        int count = 0;
        for(int i = people.length-1 ; i >= idx; i--){
            if((people[i] + people[idx]) <= limit) idx++;
            count++;
        }
        return count;
    }
}