// 0810 - 0843
class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int unit = 1; unit <= s.length() / 2 ; unit++){
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, unit);
            int count = 1;

            for (int j = unit; j <= s.length(); j += unit) {
                String sub = (j + unit <= s.length()) ? s.substring(j, j + unit) : s.substring(j);

                if (sub.equals(prev)){
                    count++;
                } else {
                    if (count > 1) compressed.append(count);
                    compressed.append(prev);
                    prev = sub;
                    count = 1;
                }
            }

            if (count > 1) compressed.append(count);
            compressed.append(prev);

            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}