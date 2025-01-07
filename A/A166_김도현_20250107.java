class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int t_length = t.length();
        int p_length = p.length();
        long p_num = Long.parseLong(p);

        for (int i = 0; i <= (t_length - p_length); i++){
            long num = Long.parseLong(t.substring(i, i + p_length));
            if (num <= p_num) count++;
        }

        return count ;
    }
}