class Solution {
    String[] possibles = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for (String bab : babbling){
            String temp = bab;
            String lastMatched = "";

            boolean replaced;
            do {
                replaced = false;
                for (String possible : possibles){
                    if (temp.startsWith(possible) && !possible.equals(lastMatched)) {
                        temp = temp.substring(possible.length());
                        lastMatched = possible;
                        replaced = true;
                        break;
                    }
                }
            } while (replaced && temp.length() > 0 );

            if(temp.length() == 0) answer++;
        }
        return answer;
    }
}